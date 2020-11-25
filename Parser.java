
//  Class parser gets tokens from the lexical analyser
// @ Dr Michel de Champlin 
// Modified by Team 



public class Parser implements IParser  {
    public Parser(Environment env) {
        this.lexer = env.getLexer();
        this.sourceFile = env.getSourceFile();
       this.errorReporter = env.getErrorReporter();
        this.table = env.getSymbolTable();
         // prime
        address = 0;
    }
    // Record the error: <t> expected, found <token> at <token>.position
    // eerrror stuff not for now 

    protected void expect(String t , String token  ) {
        errorReporter.record("expected  "+t+"  but found  "+token+"   ", lexer.getPosition());
    }
    protected void unexpected(String token  ) {
        errorReporter.record("unexpected token found  :  "+token, lexer.getPosition());
    }

  //  private class SyntaxError extends Exception {}

    // -------------------------------------------------------------------
    // An assembly unit is zero or more line statement(s).
    //
    // AssemblyUnit = { LineStmt } EOF .
    // -------------------------------------------------------------------
    public Link parse() {
    	if (Verbose.verbose)
        System.out.println("Parsing a AssemblyUnit...");
    	if (Verbose.verbose)
            System.out.println("Parsing a Line Statement...");
    	nextToken();
        LineStmtSeq seq = new LineStmtSeq();

        while ( !token.contentEquals( Lexer.EOF )	) {
        	if ( !token.contentEquals( "EOL" ) )
        	{ seq.add( parseLineStmt() );
        	address++ ;
        	}
        	nextToken() ;
        }
        setoff(seq) ;
 
        return new TranslationUnit(seq);
    }
    //-----------------------------------------------------------------------
    private void setoff( LineStmtSeq seq) { 
    	int i=0 ;
    	for (int j : Label.isoperand ) { 
    	
    		if (j==1) { 
    			int off=Label.getoff(i) ;
    		seq.settoff(Label.poexisting.get(i), off);
    		}  
    	
    		i++ ; 
    	}
    }
    private Instruction parseInherent() {
	//check if existt in  table otherwise put error   
    	if  (table.containsInherent(token)) 
    	{String mnemonic=token ; 
    	nextToken() ;
    			return new InherentInstruction	(mnemonic);}
    	else { 
    		// report error 
    		expect("inherent instructions"  , token  )  ;
    	
    		SkipLine() ;
    		return null ;
    	}
        // your code...
    }
    //---------------------------------------------------------------------------------
    private Instruction parseImmediate() {
    	String mnemonic=token.substring(0,token.indexOf('.')) ; 
    	String range=token.substring(token.indexOf('.'),token.length()) ;
    	nextToken() ;
    	String operand=token ;

    		
    	if  (!table.containsImmediate(mnemonic)) 
    		{ expect("Immediate instructions"  , mnemonic  )  ;
    		SkipLine() ;
    		return null ; 
    		}
    	ImediateInstruction I=new ImediateInstruction(mnemonic,range , operand) ;
    	if  (I.operandissue()) 
		{ expect("operand ", token  ) ;
    		SkipLine() ;
		return null ; 
		}	
    	if  (I.rangeIssue( table.getlower(range),  table.getupper(range),address)) 
    		
		{  String err="operand in reange  ["+ table.getlower(range)+ " , "+ table.getupper(range)+" ]  ";
    		expect(err, token  ) ;
    		SkipLine() ;
		return null ; 
		}	
    		
    		
    	nextToken() ;	
    		
    	return  I ;
    	
    	

        // your code...
    }
    private Label parselabel() {
    	if  (!table.containsInherent(token) &&   !false/*(table.containsImmediate(token))*/ ) { 
    	String label=token ; 

    	nextToken() ;
		return new Label(label,address);}
    	else { 
    		SkipLine() ; 
    		return null ;
    	}
        // your code...
    }
    //---------------------------------------------------------------------------------
    private Instruction parseRelative() {
		return null;
        // your code...
    }
    private Instruction parsedirective() {
		return null;
        // your code...
    }
    // -------------------------------------------------------------------
    // A line statement:
    //   - could be empty (only a EOL);
    //   - could have a single comment start at BOL or after a label, label/inst, or label/dir;
    //   - could have a label only, etc.
    //
    // LineStatement = [Label] [Instruction | Directive ] [Comment] EOL .
    //
    public LineStmt parseLineStmt() {
        Label        label = new Label() ;
        Instruction  inst = new InherentInstruction(null);
        Comment      comment = new Comment(null);
if (Verbose.verbose)
        System.out.println("Parsing a Line Statement...");


	while (token !="EOL") { 
		if (token.charAt(0)==';') {
			comment=new Comment(token ) ; nextToken() ; }
		else if (lexer.getPosition().colpos==0) { 
		label=parselabel() ;
		
	}
	
	else if ( (token.charAt(0)=='.')&& !(lexer.getPosition().colpos==0)) {
		inst=parsedirective() ; 
	}
		
	else if ( !(lexer.getPosition().colpos==0)&& !(token.contains(".")) ) {
		inst=parseInherent() ; 
	}
	else if ( (token.contains(".") )&& !(lexer.getPosition().colpos==0) ) {
		inst=parseImmediate() ;
	}
	else { unexpected( token  ) ;SkipLine() ; }
		
	
		}

if (label==null)
	label = new Label() ;
if (inst==null)
      inst = new InherentInstruction(null);
if (comment==null)
      comment = new Comment(null);

        return new LineStmt(label, inst, comment);
    }

	protected void SkipLine() { 
		while (token !="EOL") { 
			nextToken() ;
		}
		
		
	}

    protected void nextToken() {
    	
        token = lexer.getToken();
    if (Verbose.verbose)   
    	System.out.print("token found : "+token+ "  \n") ;
 
    
    }
    private int           address;
    private String           token;
    private Lexer        lexer;
   private ISourceFile   sourceFile;
   private IReportable   errorReporter;
    private SymTable  table;

}

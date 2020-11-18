
/*
 * Parser_Skeleton.java - A parser gets tokens from the lexical analyser.
 *
 * @author  Michel de Champlain
 */


public class Parser implements IParser  {
    public Parser(Environment env) {
        this.lexer = env.getLexer();
        this.sourceFile = env.getSourceFile();
       this.errorReporter = env.getErrorReporter();
        this.table = env.getSymbolTable();
        nextToken(); // prime
        address = 0;
    }
    // Record the error: <t> expected, found <token> at <token>.position
    // eerrror stuff not for now 

    protected void expect(String t , String token  ) {
        errorReporter.record("expected  "+t+"  but found  "+token+"   ", lexer.getPosition());
    }


  //  private class SyntaxError extends Exception {}

    // -------------------------------------------------------------------
    // An assembly unit is zero or more line statement(s).
    //
    // AssemblyUnit = { LineStmt } EOF .
    // -------------------------------------------------------------------
    public Link parse() {
        System.out.println("Parsing a AssemblyUnit...");

        LineStmtSeq seq = new LineStmtSeq();

        while ( !token.contentEquals( Lexer.EOF )	) {
            seq.add( parseLineStmt() );
        	nextToken() ;
        }
        return new TranslationUnit(seq);
    }
    //---------------------------------------------------------------------------------
    private Instruction parseInherent() {
	//check if existt in  table otherwise put error   
    	if  (table.iherentinstruction.contains(token)) 
    	
    			return new Instruction(token);
    	else { 
    		// report error 
    		expect("inherent instructions"  , token  )  ;
    	
    		
    		return null ;
    	}
        // your code...
    }
    //---------------------------------------------------------------------------------
    private Instruction parseImmediate() {
		return null;
        // your code...
    }
    //---------------------------------------------------------------------------------
    private Instruction parseRelative() {
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
        Label        label = null;
        Instruction  inst = null;
        Comment      comment = null;

        System.out.println("Parsing a Line Statement...");
	inst=parseInherent();

   

        return new LineStmt(label, inst, comment);
    }

    protected void nextToken() {
    	
        token = lexer.getToken();
        System.out.print(token+"  ");    }
    private int           address;
    private String           token;
    private Lexer        lexer;
   private ISourceFile   sourceFile;
   private IReportable   errorReporter;
    private ISymbolTable  table;

}
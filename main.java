import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strr=" ";
				ISymbolTable.iherentinstruction.add("halt") ; 
				ISymbolTable.iherentinstruction.add("pop") ; 
				ISymbolTable.iherentinstruction.add( "dup");
				ISymbolTable.iherentinstruction.add( "exit") ;
				ISymbolTable.iherentinstruction.add( "ret"); 
				ISymbolTable.iherentinstruction.add( "not") ; 
				ISymbolTable.iherentinstruction.add( "and");
				ISymbolTable.iherentinstruction.add( "or");
				ISymbolTable.iherentinstruction.add( "xor");
				ISymbolTable.iherentinstruction.add( "neg");
				ISymbolTable.iherentinstruction.add( "inc");
				ISymbolTable.iherentinstruction.add( "dec");
				ISymbolTable.iherentinstruction.add( "add");
				ISymbolTable.iherentinstruction.add( "sub");		
				ISymbolTable.iherentinstruction.add( "mul");
				ISymbolTable.iherentinstruction.add( "div");
				ISymbolTable.iherentinstruction.add( "rem");
				ISymbolTable.iherentinstruction.add( "shl");
				ISymbolTable.iherentinstruction.add( "shr");
				ISymbolTable.iherentinstruction.add( "teq");
				ISymbolTable.iherentinstruction.add( "tne");
				ISymbolTable.iherentinstruction.add( "tlt");
				ISymbolTable.iherentinstruction.add( "tgt");
				ISymbolTable.iherentinstruction.add( "tle");
				ISymbolTable.iherentinstruction.add( "tge");
				ISymbolTable.iherentinstruction.add( "halt") ;
		FileOutputStream n;
		try {
			n = new FileOutputStream("tnt");
			PrintStream out = new PrintStream(n);
		strr=" halt\r\n"
					+ " pop\r\n"
					+ " dup\r\n"
					+ " exit\r\n"
					+ " redqewet\r\n"
					+ " not\r\n"
					+ " and\r\n"
					+ " or \r\n"
					+ " xor\r\n"
					+ " nqdeweg\r\n"
					+ " inc\r\n"
					+ " dwdsec\r\n"
					+ " adqewdd\r\n"
					+ " sub\r\n"
					+ " mul\r\n"
					+ " div\r\n"
					+ " rem\r\n"
					+ " shl\r\n"
					+ " shr\r\n"
					+ " teq\r\n"
					+ " tne\r\n"
					+ " tlt\r\n"
					+ " tgt\r\n"
					+ " tle \r\n"
					+ " tge \r\n"
					+ " halt       \r\n"
					+ "" ;
			out.print(strr) ; 
			
	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ErrorReporter e=new ErrorReporter() ;
		String token ;
		System.out.print('\n');
		Reader red = new Reader("tnt");
		Lexer lex = new Lexer(red,e);

		ISourceFile s=new ISourceFile("tnt") ;
		SymbolTable keywordtable=new SymbolTable() ;

		Environment env=new Environment( lex,  s,  keywordtable,e) ;
		Parser par=new Parser(env ) ;
		Link a =par.parse();
		ArrayList<LineStmt> b=a.fullfile.lines ;
		
System.out.print(e.getErrors());
		System.out.print("\n\n\n");		
		System.out.print(strr);
		System.out.print("\n\n\n");	
		for (LineStmt  val :b) { 
			if (val.inst==null) {
				System.out.print("null\n");
			}
			else 	System.out.print(val.inst.instruction+"\n");
		}
		
		
		
		
		
		
		
		
		
		
	}

}

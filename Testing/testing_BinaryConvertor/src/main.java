import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strr = " ";

		FileOutputStream n;
		try {
			n = new FileOutputStream("tnt");
				PrintStream out = new PrintStream(n);
				strr =  "\n"
						+ " ldc.i3 3\n"
						+ " dup\n"
						+ " stv.u3 0 \n"
			 ;
			out.print(strr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			String[]	arg={"-l", "tnt"} ;


					// TODO Auto-generated method stub

					ISourceFile s = Factory.newSourceFile("tnt", "");
					// NEW : converts file contents to 1 string


					//String[] arg = { "-l", s.getSourcefilename() };

					// Administrator adm = new Administrator(arg);
					Administrator adm = Factory.newAdministrator(arg);
			

					// ErrorReporter e = new ErrorReporter();
					ErrorReporter e = Factory.newErrorReporter();

					String token; // not used

					// Reader red = new Reader("tnt");
					Reader red = Factory.newReader(s.getSourcefilename());
					// Lexer lex = new Lexer(red, e);
					Lexer lex = Factory.newLexer(red, e);

					// Output output = new Output("output", "txt");
					IOutput lstoutput = Factory.newOutput(s.getFilename(), "lst");
					IOutput exeoutput = Factory.newOutput(s.getFilename(), "exe");

					// ISourceFile s = new ISourceFile("tnt", "");
					// ISourceFile s = Factory.newSourceFile("tnt","");
					// ISourceFile s = Factory.newSourceFile("Code", ".asm");

					// SymTable keywordtable = new SymTable();
					SymTable keywordtable = Factory.newSymTable();

					// Environment env = new Environment(lex, s, keywordtable, e);
					Environment env = Factory.newEnvironment(lex, s, keywordtable, e);

					// Parser par = new Parser(env);
					Parser par = Factory.newParser(env);

					Link a = par.parse();
					ArrayList<LineStmt> b = a.fullfile.lines;

			String  BCTEST="" ;
					for (LineStmt val: b) { 
						BinaryConverter BC=new BinaryConverter(val) ;
						BCTEST=BCTEST+BC.getmnemonicbin()+' ' ;
					}
					
					System.out.print("Test BinaryConverter\n") ;
					//expected 
						System.out.println("97"+" "+"02"+" A8") ;
						// real output
						
						System.out.println(BCTEST) ;
			
					
					
	}
}
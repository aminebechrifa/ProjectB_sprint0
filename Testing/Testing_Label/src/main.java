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
				strr = "; Sample program\n"
						+ "\n"
						+ " ldc.i3 0\n"
						+ " dup\n"
						+ " stv.u3 0 ; n = 0\n"
						+ " stv.u3 1 ; sum = 0\n"
						+ "Loop ldv.u3 0 ; push n\n"
						+ " ldc.i8 10 ; push 10\n"
						+ " tlt ; if n < 10 then Continue\n"
						+ " brf.i5 Done ; else Done\n"
						+ "Continue ldv.u3 1 ; push sum\n"
						+ " ldv.u3 0 ; push n\n"
						+ " add ; add n to sum\n"
						+ " stv.u3 1 ; store sum\n"
					
						+ " br.i5 Loop\n"
						+ "Done\n"
						+ " halt\n" ;
			out.print(strr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1 ; Sample program\n"
				+ "2\n"
				+ "3 ldc.i3 0\n"
				+ "4 dup\n"
				+ "5 stv.u3 0 ; n = 0\n"
				+ "6 stv.u3 1 ; sum = 0\n"
				+ "7 Loop ldv.u3 0 ; push n\n"
				+ "8 ldc.i8 10 ; push 10\n"
				+ "9 tlt ; if n < 10 then Continue\n"
				+ "10 brf.i5 Done ; else Done\n"
				+ "11 Continue ldv.u3 1 ; push sum\n"
				+ "12 ldv.u3 0 ; push n\n"
				+ "13 add ; add n to sum\n"
				+ "14 stv.u3 1 ; store sum\n"
				+ "15 incv.u8 0 ; n++\n"
				+ "16 br.i5 Loop\n"
				+ "17 Done\n"
				+ "18 halt\n") ;
			String[]	arg={ "tnt"} ;


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

					
					
					System.out.println("Test Label");
				System.out.println("          Label Table        \n"
						+ "label      Line    operand/label \n"
						+ "Loop       5       label   \n"
						+ "Done       8       operand \n"
						+ "Continue   9       label   \n"
						+ "Loop       13      operand \n"
						+ "Done       14      label   ");
					Label.labeltable();

			}

			

		
	}
	



	



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
					+ " incv.u8 0 ; n++\n"
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
			String[]	arg={ "-l","tnt"} ;
		Administrator adm=new Administrator(arg) ;

		ErrorReporter e = new ErrorReporter();
		String token;

		Reader red = new Reader("tnt");
		Lexer lex = new Lexer(red, e);
		Output output = new Output("output", "txt");

		ISourceFile s = new ISourceFile("tnt", "");
		SymTable keywordtable = new SymTable();

		Environment env = new Environment(lex, s, keywordtable, e);
		Parser par = new Parser(env);
		Link a = par.parse();
		ArrayList<LineStmt> b = a.fullfile.lines;
	
		int i = 0;
if (Help.help)
	Help.helping() ;


		for (LineStmt val : b) {
System.out.print(val.tostring() +'\n');
			}
			
				System.out.print(e.getErrors());
		
			
			
		
	}}

	



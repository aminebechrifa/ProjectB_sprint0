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
			strr = " halt\r\n" + " pop\r\n" + " dup\r\n" + " exit\r\n"

					+ " not\r\n" + " and\r\n" + " or \r\n" + " xor\r\n"

					+ " inc\r\n"

					+ " sub\r\n" + " div\r\n" + " rem\r\n" + " shl\r\n" + " shr\r\n" + " teq\r\n"
					+ " tne\r\n" + " tgt\r\n" + " tle \r\n" + " tge \r\n" + " halt       \r\n" + "";
			out.print(strr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[]	arg={"-h","-v" ,"-l","tnt"} ;
		Administrator adm=new Administrator(arg) ;
System.out.print(adm.filename);
		ErrorReporter e = new ErrorReporter();
		String token;

		Reader red = new Reader("tnt");
		Lexer lex = new Lexer(red, e);
		Output output = new Output("outpuuut", "txt");

		ISourceFile s = new ISourceFile("tnt", "");
		SymTable keywordtable = new SymTable();

		Environment env = new Environment(lex, s, keywordtable, e);
		Parser par = new Parser(env);
		Link a = par.parse();
		ArrayList<LineStmt> b = a.fullfile.lines;
	
		int i = 0;
if (Help.help)
	Help.helping() ;


		

	
			if(listing.lst) { 
			
			if (!e.errors) {
				output.writeFiletop();
		for (LineStmt val : b) {
			i++ ;
			if (val.inst == null) {
				System.out.print("null\n");
			} else
				output.writeFile(Integer.toString(i), output.getADDR( i), keywordtable.getHex(val.inst.instruction),
						" ", " ", val.inst.instruction, "  ", "   ");

			}} 
			else { 
				System.out.print(e.getErrors());
				output.write(e.getErrors());
			}
			
		
	}}

	}



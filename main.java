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
						+ " .Cstring "+"\"Sdsasdf\" \n" 
						+ " stv.u3 1 ; sum = 0\n"
						+ "Loop ldv.u3 0 ; push n\n"
						+ " ldc.i8 10 ; push 10\n"
						+ " tlt ; if n < 10 then Continue\n"
						+ " brf.i5 Done ; else Done\n"
						+ "Continue ldv.u3 1 ; push sum\n"
						+ " ldv.u3 0 ; push n\n"
						+ " add ; add n to sum\n"
					
						
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
				+ "5 stv.u3 label ; n = 0\n"
				+ "6 stv.u3 1 ; sum = 0\n"
				+ " .Cstring "+"\"Sdsasdf\" \n" 
				+ "7 Loop ldv.u3 0 ; push n\n"
				+ "8 label ldc.i8 10 ; push 10\n"
				+ "9 tlt ; if n < 10 then Continue\n"
				+ "10 brf.i5 Done ; else Done\n"
				+ "11 Continue ldv.u3 1 ; push sum\n"
				+ "12 ldv.u3 0 ; push n\n"
				+ "13 add ; add n to sum\n"
				+ "14 sadstv.u3 1 ; store sum\n"
				
				+ "15 incv.u8 0 ; n++\n"
				+ "16 br.i5 Loop\n"
				+ "17 Done\n"
				+ "18 halt\n") ;
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

					int addr=0 ;
					int lines=0 ;
					if (Help.help)
						Help.helping();
					System.out.println();
					System.out.println();
					System.out.println();
					if(Verbose.verbose)
					Label.labeltable();
				
					System.out.println();
					System.out.println();
					System.out.println();
						if (!ErrorReporter.errors) {
							lstoutput.writeFileTop();
							
							for (LineStmt val : b) {
								if (val.biwritable()) {
								BinaryConverter BC=new BinaryConverter( val) ;
							// write in file also 
							lstoutput.writeConsoleExecutable(lstoutput.getexecutableline(lstoutput.getADDR(addr), BC.getmnemonicbin(), BC.getoperandhex())) ;
							lstoutput.writeExecutable(lstoutput.getexecutableline(lstoutput.getADDR(addr), BC.getmnemonicbin(), BC.getoperandhex())) ;
						lstoutput.writebinconsole(BC.hextobin(lstoutput.getADDR(addr)),BC.hextobin(BC.getmnemonicbin()) ,BC.getoperand() ) ;	
								addr++ ;
								}
								
							
								
							lines++ ;
							}
						} else {
							System.out.print(e.getErrors());
							lstoutput.write(e.getErrors());
						}
						System.out.println();
						System.out.println();

						lines=0; 
						addr=0 ;
				
						if (listing.lst) {	
							lstoutput.writeconsole("lines", "address" ,"offset", 
									"label ", " ","mnemonic" ,"operand", "comment") ;
						for (LineStmt val : b) {
					
							if (!ErrorReporter.errors) {
							if (val.biwritable()) {
							lstoutput.writeconsole(Integer.toString(lines), lstoutput.getADDR(addr),lstoutput.gethex2b( val.getoffset()), 
														val.getlabel() , " ", val.getmnemonic(), val.getoperand(), val.getcomment());
							
							lstoutput.writeFile(Integer.toString(lines), lstoutput.getADDR(addr),
									lstoutput.gethex2b( val.getoffset()), val.getlabel() , " ", val.getmnemonic(), val.getoperand(), val.getcomment());
							addr++ ;}
							else {
								lstoutput.writeconsole(Integer.toString(lines),null,
										lstoutput.gethex2b( val.getoffset()), val.getlabel() , " ", val.getmnemonic(), val.getoperand(), val.getcomment());
								lstoutput.writeFile(Integer.toString(lines),null,
										lstoutput.gethex2b( val.getoffset()), val.getlabel() , " ", val.getmnemonic(), val.getoperand(), val.getcomment());}
								lines++ ;
						}}}
					

			}

			

		
	}
	



	



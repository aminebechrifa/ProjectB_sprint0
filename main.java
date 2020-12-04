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
				strr = "   enter.u5  0        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  1        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  2        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  3        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  4        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  5        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  6        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  7        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  8        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  9        ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  10       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  11       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  12       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  13       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  14       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  15       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  16       ; OK, number <u5> [0..31].\n"
						+ "          enter.u5  17       ; OK, number <u5> [0..31].\n"
						+ "          enter.u5  18       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  19       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  20       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  21       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  22       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  23       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  24       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  25       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  26       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  27       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  28       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  29       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  30       ; OK, number <u5> [0..31].           \n"
						+ "          enter.u5  31       ; OK, number <u5> [0..31].           \n"
						+ "\n"
						+ "label          .Cstring \"A2\"                                                        \n "
						+ "            ldc.i8  label        ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  1        ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  2        ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  3        ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  -4       ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  -3       ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  -2       ; OK, number <i3> [-4..3]. \n"
						+ "            ldc.i3  -1       ; OK, number <i3> [-4..3]. \n"
						+ "\n"
						+ "           addv.u3  0        ; OK, number <u3> [0..7].           \n"
						+ "           addv.u3  1        ; OK, number <u3> [0..7].    \n"
						+ "           addv.u3  2        ; OK, number <u3> [0..7].    \n"
						+ "           addv.u3  3        ; OK, number <u3> [0..7].    \n"
						+ "           addv.u3  4        ; OK, number <u3> [0..7].    \n"
						+ "           addv.u3  5        ; OK, number <u3> [0..7].    \n"
						+ "           addv.u3  6        ; OK, number <u3> [0..7].    \n"
						+ "           addv.u3  7        ; OK, number <u3> [0..7].    \n"
						+ "\n"
						+ "            ldv.u3  0        ; OK, number <u3> [0..7].           \n"
						+ "            ldv.u3  1        ; OK, number <u3> [0..7].    \n"
						+ "            ldv.u3  2        ; OK, number <u3> [0..7].    \n"
						+ "            ldv.u3  3        ; OK, number <u3> [0..7].    \n"
						+ "            ldv.u3  4        ; OK, number <u3> [0..7].    \n"
						+ "            ldv.u3  5        ; OK, number <u3> [0..7].    \n"
						+ "            ldv.u3  6        ; OK, number <u3> [0..7].    \n"
						+ "            ldv.u3  7        ; OK, number <u3> [0..7].    \n"
						+ "\n"
						+ "            stv.u3  0        ; OK, number <u3> [0..7].           \n"
						+ "            stv.u3  1        ; OK, number <u3> [0..7].    \n"
						+ "            stv.u3  2        ; OK, number <u3> [0..7].    \n"
						+ "            stv.u3  3        ; OK, number <u3> [0..7].    \n"
						+ "            stv.u3  4        ; OK, number <u3> [0..7].    \n"
						+ "            stv.u3  5        ; OK, number <u3> [0..7].    \n"
						+ "            stv.u3  6        ; OK, number <u3> [0..7].    \n"
						+ "            stv.u3  7        ; OK, number <u3> [0..7].    \n"
						+ "" ;
			out.print(strr);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(strr) ;
			String[]	arg={"-l","-v", "tnt"} ;


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
							lstoutput.writeConsolehexExecutable(lstoutput.getexecutableline(lstoutput.getADDR(addr), BC.getmnemonicbin(), BC.getoperandhex())) ;
							exeoutput.writeExecutable(lstoutput.getexecutableline(lstoutput.getADDR(addr), BC.getmnemonicbin(), BC.getoperandhex())) ;

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
	



	



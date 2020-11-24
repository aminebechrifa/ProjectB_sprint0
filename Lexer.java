// class lexer
public class Lexer   {

	static final String EOF ="E O F";
	private static final String ILLEGAL_CHAR = "I L C";
	Reader reader;
	//ISymbolTable keywordTable;
	int linePos;
	int colPos;
	int curlinePos;
	int curcolPos;
	int ch;

ErrorReporter e ;
	public Lexer(Reader reader , ErrorReporter er /*, ISymbolTable keywordTable*/) {
		this.reader = reader;
	//	this.keywordTable = keywordTable;

		// Enter all mnemonics as keywords in the symbol table...
e=er ;
		linePos = 1;
		colPos = 0;
		curlinePos = linePos;
		curcolPos = colPos;

		read(); // prime

	}

	/* Read the next character. */
	private int read() {

		return ch = reader.read();
	}

	private String scanNumber() {
		String number = "" ;
		
		boolean isdig=true ;
		while ((ch != (int)' ') && (ch != (int)'\n') && (ch != (int)'\r') && (ch != (int)';')  && (ch != -1)&& isdig) {


			if (!Character.isDigit(ch)) {
				isdig=false ;
			}
			number = number +(char) ch;
			read();

				
		}
		if (!isdig)
			{error(number)  ; 
			return getToken() ;}
		colPos++ ;
		return number;
	}

	private String scanIdentifier() {

		String ide = "";
		while ((ch != (int)' ') &&(ch != (int)';')&& (ch != (int)'\n')   && (ch != (int)'\r') && (ch != -1) ) {
	
			ide = ide +(char) ch;
			read();
	
		}
		colPos++ ;
		return ide;
	}

	private String scanDirective() {
		String dir = "" ;
		while ((ch != (int)' ') &&(ch != (int)'\n') && 
				(ch != (int)'\r') && (ch != (int)';')  && (ch != -1) ) {
		

			dir = dir +(char) ch;
			read();

		}
		colPos++ ;
		return dir;
	}

	private String scanString() {
		String str = "";
		while (ch != (int)'"') {
		
			// if EOF without having the " WEE GOT PROBLEM
			str = str +(char) ch;
			read();
		}
		colPos++ ;
		return str;
	}
	
	
	private String scanComment() {
		String str = "";
	
		while ((ch != (int)'\n')&&(ch != (int)'\r')&& (ch != -1)) {
	
			// if EOF without having the " WEE GOT PROBLEM
			str = str +(char) ch;
			read();

		}
		colPos++ ;
		return str;
	}

	private void error(String t) {
		e.record( 	"token expected  but fou	nd "+t, getPosition() );
	}
public Position getPosition() { 
	return new Position(curlinePos,curcolPos) ;
}
	/**
	 * Scan the next token. Mark position on entry in case of error.
	 * 
	 * @return the token.
	 */
	public String getToken() {
		if (ch == (int)' ') 
			{ read();colPos++ ;}
		// skip whitespaces
		// "\n", "\r\n", "\n", or line comments are considered as EOL
		
		boolean test= true ;
		while (test) {
		
			if (ch == (int)' ') 
				read();
		
			else if ((ch ==(int) '\r')) { 
				read();
			
				colPos=0  ; 
				curcolPos=0 ;}
			
			else test=false ;
		}
		// Mark position (after skipping blanks)
			
		curcolPos = colPos;
		curlinePos=linePos ;
		while (true) {
		
			
	
			switch (ch) {
			case -1:
				return EOF;
			case ((int)'\n'):
				{	
				read(); 
				linePos++;
				colPos=0  ; 
				curcolPos=0 ;
				return "EOL" ; 
			}
			case (int)'a':
				
			case (int)'b':
			case (int)'c':
			case (int)'d':
			case (int)'e':
			case (int)'f':
			case (int)'g':
			case (int)'h':
			case (int)'i':
			case (int)'j':
			case (int)'k':
			case (int)'l':
			case (int)'m':
			case (int)'n':
			case (int)'o':
			case (int)'p':
			case (int)'q':
			case (int)'r':
			case (int)'s':
			case (int)'t':
			case (int)'u':
			case (int)'v':
			case (int)'w':
			case (int)'x':
			case (int)'y':
			case (int)'z':
			case (int)'A':
			case (int)'B':
			case (int)'C':
			case (int)'D':
			case (int)'E':
			case (int)'F':
			case (int)'G':
			case (int)'H':
			case (int)'I':
			case (int)'J':
			case (int)'K':
			case (int)'L':
			case (int)'M':
			case (int)'N':
			case (int)'O':
			case (int)'P':
			case (int)'Q':
			case (int)'R':
			case (int)'S':
			case (int)'T':
			case (int)'U':
			case (int)'V':
			case (int)'W':
			case (int)'X':
			case (int)'Y':
			case (int)'_':
			case (int)'Z':
			{	
			return scanIdentifier();}
			case (int)';':
				return scanComment();

			case '.': /* dot for directives as a first character */
				return scanDirective();

			case (int)'0':
			case (int)'1':
			case (int)'2':
			case (int)'3':
			case (int)'4':
			case (int)'5':
			case (int)'6':
			case (int)'7':
			case (int)'8':
			case (int)'9':

				return scanNumber();

			case (int)'-':
				read();
				return "-" + scanNumber();
			

			case (int)'"':
				return scanString();

			default:
				error(scanIdentifier()  ) ;
		
				return getToken();
			}
		}
	}
}


public class Environment {
	Lexer  lexer ;
	ISourceFile  SourceFile ;
	ISymbolTable keywordtable ;
	IReportable errorReporter ;
	
	
	
	public Environment(Lexer lexer, ISourceFile sourceFile, ISymbolTable keywordtable) {
		super();
		this.lexer = lexer;
		SourceFile = sourceFile;
		this.keywordtable = keywordtable;
	}
	public Lexer getLexer() {
	
		return lexer;
	}

	
	
	
	public ISymbolTable getSymbolTable() {
	
		return keywordtable;
	}
	public ISourceFile getSourceFile() {
		
		return SourceFile;
	}
	public IReportable getErrorReporter() {
		// TODO Auto-generated method stub
		return errorReporter;
	}

}

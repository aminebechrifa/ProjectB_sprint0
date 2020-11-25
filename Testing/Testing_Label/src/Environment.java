// class environment 
public class Environment {

	Lexer  lexer ; 
	ISourceFile  SourceFile ;
	SymTable keywordtable ;
	IReportable errorReporter ;
	
	

	public Environment(Lexer lexer, ISourceFile sourceFile, SymTable keywordtable, IReportable ER) {
		super();
		this.lexer = lexer;
		SourceFile = sourceFile;
		this.keywordtable = keywordtable;
		errorReporter=ER ;
	}
	
	// getters to return the attributes of an Environment :
	
	public Lexer getLexer() {
	
		return lexer;
	}
	
	public SymTable getSymbolTable() {
	
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

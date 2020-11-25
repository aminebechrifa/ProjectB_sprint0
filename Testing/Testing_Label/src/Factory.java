class Factory {
    // Factory to hide "new" in driver class
    // remember to use static

    public static Administrator newAdministrator(String[] arg) {
        return new Administrator(arg);
    }

    public static ErrorReporter newErrorReporter() {
        return new ErrorReporter();
    }

    public static Environment newEnvironment(Lexer lexer, ISourceFile sourceFile,SymTable keywordtable,
            IReportable ER) {
        return new Environment(lexer, sourceFile, keywordtable, ER);
    }

    public static Lexer newLexer(Reader red, ErrorReporter e) {
        return new Lexer(red, e);
    }

    public static IOutput newOutput(String fn, String ext) {
        return new Output(fn, ext);
    }

    public static Parser newParser(Environment env) {
        return new Parser(env);
    }

    public static Reader newReader(String str) {
        return new Reader(str);
    }

    public static ISourceFile newSourceFile(String fn, String ext) {
        return new SourceFile(fn, ext);
    }

    public static SymTable newSymTable() {
        return new SymTable();
    }
}
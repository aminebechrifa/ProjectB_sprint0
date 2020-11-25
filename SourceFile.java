class SourceFile implements ISourceFile {

    // filename is before the last comma, eg. "p.r.o.g.r.a.m" from
    // "p.r.o.g.r.a.m.exe"
    String filename;

    // extension is after the last comma, eg: ".exe" from "p.r.o.g.r.a.m.exe"
    // Warning: extension will keep the comma
    String extension;

    // if filename and extension are separate
    public SourceFile(String fn, String ext) {
        this.setFilename(fn);
        this.setExtension(ext);
    }

    // if filename are together
    public SourceFile(String sourcefile) {
        this.setFullfilename(sourcefile);
    }

    // getOperands
    public String getFilename() {
        return filename;
    }

    public String getExtension() {
        return extension;
    }

    public String getSourcefilename() {
        return filename + extension;
    }

    // setOperands
    public void setFilename(String fn) {
        this.filename = fn;
    }

    public void setExtension(String ext) {

        // to prevent out of bound for charAt(0)
        if (ext == "")
            this.extension = "";

        // this checks if extension starts with a comma and add if there is not
        else if (ext.charAt(0) != '.')
            this.extension = "." + ext;

        else
            this.extension = ext;
    }

    // most complicated of this class
    // provides the full file name, eg: program.exe, and it will set
    public void setFullfilename(String sourcefile) {

        // sets the names to blank
        this.setFilename("");
        this.setExtension("");

        // reads backwards to find the last comma (quickly) and saves the index
        int index = -1;
        for (int i = 1; i <= sourcefile.length(); i++) {
            if (sourcefile.charAt(sourcefile.length() - i) == '.') {
                index = sourcefile.length() - i;
                break; // break if found
            }
        }

        // weird cases
        // in case the file does not have an extension
        if (index == -1) {
            setFilename(sourcefile);
        }

        // if sourcefile is named normally or the file is just named as ".exe"
        else {
            setFilename(sourcefile.substring(0, index));
            setExtension(sourcefile.substring(index, sourcefile.length()));
        }
    }

    // printOperands
    public void printFilename() {
        System.out.print(filename);
    }

    public void printExtension() {
        System.out.print(extension);
    }

    public void printSourcefilename() {
        System.out.print(filename + extension);
    }

}

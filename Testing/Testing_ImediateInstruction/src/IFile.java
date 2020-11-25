
public interface IFile {
    public String getFilename();

    public String getExtension();

    public String getSourcefilename();

    public void setFilename(String fn);

    public void setExtension(String ext);

    public void setFullfilename(String sourcefile);

    public void printFilename();

    public void printExtension();

    public void printSourcefilename();
}
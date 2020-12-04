public interface IOutput extends IFile {

        // For Listing
        public void writeFile(String line, String addr, String machine, String offset, String label, String mnemonic,
                        String operand, String comments);

        public void writeconsole(String line, String addr, String machine, String offset, String label, String mnemonic,
                        String operand, String comments);

        // write .lst header
        public void writeFileTop();

        // basic write method
        public void write(String str);

        // .exe instructions
        
        public void   writeExecutable(String code);
        public void   writeConsoleExecutable(String code);
        public void writeConsolehexExecutable(String code) ;
        // get address
        public String getADDR(int i);

        // convert to hex
        public String gethex2b(String ss);

        public String getFilename();

        public String getExtension();

        public String getSourcefilename();

        // setOperands
        public void setFilename(String fn);

        public void setExtension(String ext);

        // provides the full file name, eg: program.exe, and it will set
        public void setFullfilename(String sourcefile);

        // printOperands
        public void printFilename();

        public void printExtension();

        public void printSourcefilename();
    
        public String getexecutableline(String addr, String machine,String offset) ;
      

public void writeFile(String offset, String address, String label, String mnemonic, String operand,
                String comment);

public void writeFile2(String address, String offset, String label, String mnemonic, String operand,
                String comment);

public void writeFileTop2();

public void writeFile3(String address, String label, String mnemonic, String operand, String comment);

public void writeFileTop3();

public void writeFiles1(String line, String str, String addr, String asm);

public void writeBinaryFileTop();

public void writeBinaryFile(String addr, String code);





	
	public void writebinconsole(String addr, String machine,String offset ) ;
}
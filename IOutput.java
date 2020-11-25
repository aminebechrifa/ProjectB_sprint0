public interface IOutput extends IFile {

        public void writeFile(String line, String addr, String machine, String code, String label, String asm,
                        String code2, String comments);

        public void writeFileTop();

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

        public void write(String str);

        public String getADDR(int i);
        public void writeconsole(String line, String addr, String machine,String offset,String label, String mnemonic, String operand ,
                String comments) ;
        public String gethex2b(String ss) ; 
       public void writebinconsole(String addr, String machine,String offset ) ;

}
import java.io.IOException;
import java.io.FileWriter; // for append mode

public class Output implements IOutput {

    // Added filename, extension, since we will write to the same file a lot
    String filename;
    String extension;

    Output(String fn, String ext) {
        this.filename = fn;
        this.extension = ext;
    }

    // Writes line to a file with \n at the end
    public void writeFile(Object str) {
        write(str + "\n");
    }

    // For Listing
    public void writeFile(String line, String addr, String machine, String offset, String label, String mnemonic,
            String operand, String comments) {
        if (label == null)
            label = "";
        if (addr == null)
            addr = "";
        if (machine == null)
            machine = "";
        if (offset == null)
            offset = "";
        if (mnemonic == null)
            mnemonic = "";
        if (operand == null)
            operand = "";
        if (comments == null)
            comments = "";

        write(String.format("%-4s %-4s %-13s %-7s %-5s %-13s %-10s %-8s %n", line, addr, machine, offset, label,
                mnemonic, operand, comments));
    }

    public void writeconsole(String line, String addr, String machine, String offset, String label, String mnemonic,
            String operand, String comments) {
        if (label == null)
            label = "";
        if (addr == null)
            addr = "";
        if (machine == null)
            machine = "";
        if (offset == null)
            offset = "";
        if (mnemonic == null)
            mnemonic = "";
        if (operand == null)
            operand = "";
        if (comments == null)
            comments = "";

        System.out.print(String.format("%-4s %-4s %-13s %-7s %-5s %-13s %-10s %-8s %n", line, addr, machine, offset,
                label, mnemonic, operand, comments));
        
    }
    public String getexecutableline(String addr, String machine,String offset) {  
    	if (addr == null)
    	addr = "";
    if (machine == null)
    	machine = "";
    if (offset == null)
    	offset = "";


 return ( addr+ machine+ offset);
    	
    }

    // write .lst header
    public void writeFileTop() {

        write(String.format("%-4s %-4s %-7s %-5s %-13s %-8s %-15s %s %n%n", "Line", "Addr", "Machine", "Code", "Label",
                "Assembly", "Code", "Comments"));

    }

    // basic write method
    public void write(String str) {

        String fn = this.filename;
        String ext = this.extension;

        try {
            // adds a comma to ext if needed
            if (ext == "")
                ext = "";
            else if (ext.charAt(0) != '.')
                ext = "." + ext;
            // Write to file and adds a \n, does not override with FileWriter(...,true);
            // adds a comma to ext if needed
            FileWriter fileWriter = new FileWriter(fn + ext, true);
            fileWriter.write(str);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // write to .exe with machine code (hex) as input
    public void writeExecutable(String code){

    	StringBuilder s = new StringBuilder("");
            
            for (int i = 0; i < code.length(); i += 2) {
                String str = code.substring(i, i + 2);
                s.append((char) Integer.parseInt(str, 16));
            }
            
        write(s.toString()+'\n');
    }

    // write to console as in .exe with machine code (hex) as input
    public void writeConsoleExecutable(String code){
         
     	   ;
    	StringBuilder s = new StringBuilder("");
            
            for (int i = 0; i < code.length(); i += 2) {
                String str = code.substring(i, i + 2);
             
                s.append((char) Integer.parseInt(str, 16));
            }
            
        System.out.print(s.toString()+'\n');
    }
    




    
    

    
    public void writebinconsole(String addr, String machine,String offset ) {

        if (addr == null)
        	addr = "";
        if (machine == null)
        	machine = "";
        if (offset == null)
        	offset = "";


        System.out.print( addr+"  "+ machine+ " "+ offset+'\n');
    }
  

  
    // For Sprint 2
    public void writeFile(String offset, String address, String label, String mnemonic, String operand,
            String comment) {

        if (label == null)
            label = "";
        if (address == null)
            address = "";
        if (mnemonic == null)
            mnemonic = "";
        if (operand == null)
            operand = "";
        if (comment == null)
            comment = "";
        if (offset == null)
            offset = "";

        write(String.format("%-5s %-7s %-7s %-9s %s %s %n", address, label, mnemonic, operand, comment, offset));

    }

    // Sprint 2 with spot for offset
    public void writeFile2(String address, String offset, String label, String mnemonic, String operand,
            String comment) {

        if (label == null)
            label = "";
        if (address == null)
            address = "";
        if (mnemonic == null)
            mnemonic = "";
        if (operand == null)
            operand = "";
        if (comment == null)
            comment = "";
        if (offset == null)
            offset = "";

        write(String.format("%-5s %-7s %-7s %-7s %-9s %s %n", address, offset, label, mnemonic, operand, comment));

    }

    // Write header
    public void writeFileTop2() {
        writeFile2("Addr", "Offset", "Label", "Mne", "Operand", "");
    }

    // without offset
    public void writeFile3(String address, String label, String mnemonic, String operand, String comment) {

        writeFile("", address, label, mnemonic, operand, comment);

    }

    // write header
    public void writeFileTop3() {

        writeFile3("Addr", "Label", "Mne", "Operand", "");

    }

    // exclusively used for Sprint 1 with less outputs
    public void writeFiles1(String line, String str, String addr, String asm) {
        write(String.format("%-2s %-3s %-5s %-4s %n", line, str, addr, asm));
    }

    public void writeBinaryFileTop() {
        writeBinaryFile("Addr", "Machine Code");
    }

    public void writeBinaryFile(String addr, String code) {
        if (addr == null)
            addr = "";
        if (code == null)
            code = "";
        write(String.format("%-6s %s %n", addr, code));
    }

  


    public String getADDR(int i) {
        String str = "0000000" + Integer.toHexString(i).toUpperCase();
        return str.substring(str.length() - 4, str.length());
    }
    public String gethex2b(String ss) {
    	int i= Integer.parseInt(ss) ;
        String str = "0000000" + Integer.toHexString(i).toUpperCase();
        return str.substring(str.length() - 2, str.length());
    }

  
    
    
    
    // basic get/set/print
    public String getFilename() {
        return filename;
    }

    public String getExtension() {
        return extension;
    }

    public String getSourcefilename() {
        return filename + extension;
    }

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

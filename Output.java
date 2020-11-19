import java.io.IOException;
import java.io.FileWriter; // for append mode

public class Output {

    // Added filename, extension, since we will write to the same file a lot
    String filename;
    String extension;

    Output(String fn, String ext) {
        this.filename = fn;
        this.extension = ext;
    }

    // Writes line to a file with the same filename but different extension
    public void writeFile(Object str) {
        String fn = this.filename;
        String ext = this.extension;
        
        // Write to file and adds a \n, does not override with FileWriter(...,true);
        try {
            // adds a comma to ext if needed
            if (ext == "")
                ext = "";
            else if (ext.charAt(0) != '.')
                ext = "." + ext;

            FileWriter fileWriter = new FileWriter(fn + ext, true);
            fileWriter.write(str + "\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // if line is not combined
    public void writeFile(String line, String addr, String machine, String code, String label,
            String asm, String code2, String comments) {

        String fn = this.filename;
        String ext = this.extension;

                // Write to file and adds a \n, does not override with FileWriter(...,true);
        try {
            // adds a comma to ext if needed
            if (ext == "")
                ext = "";
            else if (ext.charAt(0) != '.')
                ext = "." + ext;

            FileWriter fileWriter = new FileWriter(fn + ext, true);
            fileWriter.write(String.format("%-4s %-4s %-7s %-5s %-13s %-8s %-11s %-30s %n", line, addr, machine, code,
                    label, asm, code2, comments));
            fileWriter.close();

        } catch (

        IOException e) {
            e.printStackTrace();
        }
    }

    // exclusively used for Sprint 1 with less outputs
    public void writeFiles1(String line, String str, String addr, String asm) {
        String fn = this.filename;
        String ext = this.extension;
        
        // Write to file and adds a \n, does not override with FileWriter(...,true);
        try {
            // adds a comma to ext if needed
            if (ext == "")
                ext = "";
            else if (ext.charAt(0) != '.')
                ext = "." + ext;

            FileWriter fileWriter = new FileWriter(fn + ext, true);
            fileWriter.write(String.format("%-2s %-3s %-5s %-4s %n", line, str, addr, asm)); // what is in str place?
            fileWriter.close();

        } catch (

        IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFiletop() {
        
        String fn = this.filename;
        String ext = this.extension;

        // Write to file and adds a \n, does not override with FileWriter(...,true);
        try {
            // adds a comma to ext if needed
            if (ext == "")
                ext = "";
            else if (ext.charAt(0) != '.')
                ext = "." + ext;

            FileWriter fileWriter = new FileWriter(fn + ext, true);
            fileWriter.write(String.format("%-4s %-4s %-7s %-5s %-13s %-8s %-11s %-30s %n%n", "Line", "Addr", "Machine",
                    "Code", "Label", "Assembly", "Code", "Comments"));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void write(String errors) {
        
        String fn = this.filename;
        String ext = this.extension;

        // Write to file and adds a \n, does not override with FileWriter(...,true);
        try {
            // adds a comma to ext if needed
            FileWriter fileWriter = new FileWriter(fn + ext, true);
            fileWriter.write(errors);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String  getADDR(int i) {
    	String str= "0000000"+Integer.toHexString(i).toUpperCase() ;
    	return  str.substring(str.length()-4,str.length()) ;}
     
    }


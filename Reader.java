import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {
	
	
	FileInputStream inputStream ; 
	public Reader(	String  file  ) {
		try {
			FileInputStream input = new FileInputStream(file);
			this.inputStream =input ; 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	private static final int EOF = -1;
	

	public  int read() {
        try {
        	int c ;
            if ((c = inputStream.read()) != EOF)
                return c ;
       
        } catch (IOException e) {
            System.out.println("Computer.init(): IOException - abort wcOO");
            System.exit(1);
            return -2 ;
            // DO ERROR STUFF
        }
        return EOF ;
    }
	 }

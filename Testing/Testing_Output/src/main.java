import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
					// Output output = new Output("output", "txt");
					IOutput lstoutput = Factory.newOutput("", "lst");
					IOutput exeoutput = Factory.newOutput("", "exe");

				System.out.println("Test Output") ;
				System.out.println("line addr machine offset  label mnemonic      operand  comments    ");
				lstoutput.writeconsole("line", "addr" , "machine" , "offset" , "label" , "mnemonic" , "operand" , "comments");

			}

			

		
	}
	



	



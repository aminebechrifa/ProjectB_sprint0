import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ImediateInstruction inst1=new	ImediateInstruction("dlc",".i3", "15") ;
		ImediateInstruction inst2=new	ImediateInstruction("dlc",".i3", "0") ;		
		ImediateInstruction inst3=new	ImediateInstruction("dlc",".i3", null) ;
	SymTable table= new SymTable() ;
	System.out.print("Test ImediateInstruction\n") ;
	//expected 
		System.out.println("true"+" "+"false"+" false") ;
		// real output
		
		System.out.println(inst1.rangeIssue(table.getlower(".i3"), table.getupper(".i3"), 0)+" "+
		inst2.rangeIssue(table.getlower(".i3"), table.getupper(".i3"), 0)+" "+
		inst2.operandissue()) ;

			}

			

		
	}
	



	



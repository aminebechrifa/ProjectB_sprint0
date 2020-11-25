
public abstract class Instruction {
String mnemonic ;
String range= null;
public String operand=null;

public Instruction(String str) { 
	mnemonic=str ;
}
public abstract String tostring() ;




}

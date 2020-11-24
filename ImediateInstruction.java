
public class ImediateInstruction extends InherentInstruction {


String range ; 
String operand ; 

public ImediateInstruction(String str,String rang , String operan) {
	super(str);
	range=range ; 
	operand=operan ;
	
	// TODO Auto-generated constructor stub
}

public String getmnemonic() { 
	return mnemonic  ;
}
public String getoperand() { 
	return operand  ;
}

public boolean rangeIssue(int l , int u ) { 
	boolean test= false ;
try { 
	 test=(l <= Integer.parseInt(operand)
			&& (u>= Integer.parseInt(operand)  )) ;
}
catch (Exception e){ 
	test= ( ( l <= operand.length())
			&& (u>= operand.length()  ) )  ;
}
return test ;
} 


public boolean operandissue() { 
if ( operand==null )
	return true ; 
if ( (operand.charAt(0)==';')||(operand.charAt(0)=='.')) 
	return true ;
else return false ;
}

}


public class ImediateInstruction extends InherentInstruction {




public ImediateInstruction(String str,String rang , String operan) {
	super(str);
	range=rang ; 
	operand=operan ;
	
	// TODO Auto-generated constructor stub
}

public String getmnemonic() { 
	return mnemonic  ;
}
public String getoperand() { 
	return operand  ;
}

public boolean rangeIssue(double l , double u ,int add) { 
	boolean test= false ;
try { 

	 test=(l <= Integer.parseInt(operand)
			&& (u>= Integer.parseInt(operand)  )) ;
}
catch (Exception e){ 
	Label label=new Label(operand ,add,1 ) ;
	test= ( (u>= operand.length()  ) && ( l <= operand.length()) )  ;
}
return !test ;
} 


public boolean operandissue() { 
if ( operand==null )
	return true ; 
if ( (operand.charAt(0)==';')||(operand.charAt(0)=='.')) 
	return true ;
else return false ;
}
public String tostring() {
	// TODO Auto-generated method stub
	return mnemonic+ ' '+range +' '+ operand ;
}

String getoperandtype() { 
	return null ;
}

}

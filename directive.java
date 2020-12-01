
public class directive extends Instruction {

	
	


	
directive(String direct , String ster){ 
		super(direct) ;
		operand=ster ;
	}


public String getmnemonic() { 
	return mnemonic  ;
}
public String getoperand() { 

	return operand  ;
}




	@Override
	public String tostring() {
		// TODO Auto-generated method stub
		return mnemonic+"  "+ operand;
	}
}

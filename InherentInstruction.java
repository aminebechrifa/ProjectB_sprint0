
public class InherentInstruction extends Instruction {

	public InherentInstruction(String str) {
		super(str);

	}
	public String getcontent() { 
		return mnemonic ;
	}

@Override
public String tostring() {
	// TODO Auto-generated method stub
	return mnemonic ;
}
}

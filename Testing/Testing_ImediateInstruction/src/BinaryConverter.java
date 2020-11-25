
public class BinaryConverter {
	SymTable table = Factory.newSymTable();
LineStmt val ;
public BinaryConverter(LineStmt va) {
	 val=va ;
}


public  String getmnemonicbin() { 
	if (val.inst!=null ) {
	Instruction inst=val.inst ;
	if (table.containsInherent(inst.mnemonic)) { 
		return table.getHex(inst.mnemonic) ;
	}else if (table.containsImmediate(inst.mnemonic)) {
		
		int mnemval=Integer.parseInt(table.getHex(inst.mnemonic),16); 
	
	String str ;
		if(Character.isDigit(inst.operand.charAt(0))) 
		 str=("00"+Integer.toHexString((int) (mnemval-table.getlower(inst.range) +Integer.parseInt(inst.operand))).toUpperCase()) ;
		else
			str=("00"+Integer.toHexString(mnemval)).toUpperCase() ;
		return    str.substring(str.length() - 2, str.length()); 
	}}
	 return null ;
}


public  String getoffsetbin () { 
	if (!val.getoffset().contentEquals("0")) {
	
	 	String str="0000"+Integer.toHexString(Integer.parseInt(val.getoffset())) ;
return str.substring(str.length() - 4, str.length()).toUpperCase(); }
	return null ;
}




}

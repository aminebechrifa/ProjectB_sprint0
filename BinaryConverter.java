
public class BinaryConverter {
	SymTable table = Factory.newSymTable();
LineStmt val ;
public BinaryConverter(LineStmt va) {
	 val=va ;
}


public  String getmnemonicbin() { 
	Instruction inst=null ;
	if (val.inst!=null ) {
	 inst=val.inst ;
	if (table.containsInherent(inst.mnemonic)) { 
		return table.getHex(inst.mnemonic) ;
	}else if (table.containsImmediate(inst.mnemonic+inst.range) || table.containsRelative(inst.mnemonic+inst.range) ) {
		
		int mnemval=Integer.parseInt(table.getHex(inst.mnemonic),16); 
	
	String str ;
		if(Character.isDigit(inst.operand.charAt(0))) 
		 str=("00"+Integer.toHexString((int) (mnemval-table.getlower(inst.range) +Integer.parseInt(inst.operand))).toUpperCase()) ;
		else
			str=("00"+Integer.toHexString(mnemval)).toUpperCase() ;
		return    str.substring(str.length() - 2, str.length()) ; 
	}}
	 return null ;
}


public  String getoffsetbin () { 
	if (!val.getoffset().contentEquals("0")) {
	
	 	String str="0000"+Integer.toHexString(Integer.parseInt(val.getoffset())) ;
return str.substring(str.length() - 4, str.length()).toUpperCase(); }
	return null ;
}

public  String getoperand () {
	
	if (!(val.inst.operand==null) && ((val.inst.operand.charAt(0) =='\"'))) { 
		return convstring() ;
		}
		
	
	if (!val.getoffset().contentEquals("0")) { 
			return hextobin(getoffsetbin ()) ;
		}
	return null ;
}


public  String getoperandhex () {
	
	if (!(val.inst.operand==null) && ((val.inst.operand.charAt(0) =='\"'))) { 
		return convstringhex() ;
		}
		
	
	if (!val.getoffset().contentEquals("0")) { 
			return getoffsetbin () ;
		}
	return null ;
}


public String convstring() {
	String str="" ; 
	for (int i=1 ; i<val.inst.operand.length()-1 ; i++ ) { 
	String numb=	"000000"+Integer.toBinaryString( (int)val.inst.operand.charAt(0)) ;
	numb=numb.substring(numb.length() - 8, numb.length()).toUpperCase();
	str=str+numb ;}
	return str ;
	
}

public String convstringhex() {
	String str="" ; 
	for (int i=1 ; i<val.inst.operand.length()-1 ; i++ ) { 
	String numb=	"0"+Integer.toHexString( (int)val.inst.operand.charAt(i)) ;
	
	numb=numb.substring(numb.length() - 2, numb.length()).toUpperCase();
	str=str+numb ;}
	
	return str ;
	
}
public  String hextobin (String str ) { 
	if (str!=null) { 
int val=Integer.parseInt(str,16) ;
 return Integer.toBinaryString(  val)  ;} 
	return null ;
}
}

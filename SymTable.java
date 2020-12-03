import java.util.HashMap;
import java.util.Map;

public class SymTable {
	Map<String, String> inherent = new HashMap<String,String>();
	Map<String, String> immediate = new HashMap<String,String>();
	Map<String, String> relative  = new HashMap<String,String>();
	Map<String, String> BinTable = new HashMap<String,String>();
	Map<String, String> HexTable = new HashMap<String,String>();
	
	Map<String, Double> lower = new HashMap<String,Double>();
	Map<String, Double> upper = new HashMap<String,Double>();
	

	public SymTable() {
		//All key-token pairs
		inherent.put("INHERENT_BEGIN","mnemonic");
		inherent.put("halt","mnemonic");
		inherent.put("pop","mnemonic");
		inherent.put("dup","mnemonic");
		inherent.put("exit","mnemonic");
		inherent.put("ret","mnemonic");
		inherent.put("RFU1","mnemonic");
		inherent.put("RFU2","mnemonic");
		inherent.put("RFU3","mnemonic");
		inherent.put("RFU4","mnemonic");
		inherent.put("RFU5","mnemonic");
		inherent.put("RFU6","mnemonic");
		inherent.put("RFU7","mnemonic");
		inherent.put("not","mnemonic");
		inherent.put("and","mnemonic");
		inherent.put("or","mnemonic");
		inherent.put("xor","mnemonic");
		inherent.put("neg","mnemonic");
		inherent.put("inc","mnemonic");
		inherent.put("dec","mnemonic");
		inherent.put("add","mnemonic");
		inherent.put("sub","mnemonic");
		inherent.put("mul","mnemonic");
		inherent.put("div","mnemonic");
		inherent.put("rem","mnemonic");
		inherent.put("shl","mnemonic");
		inherent.put("shr","mnemonic");
		inherent.put("teq","mnemonic");
		inherent.put("tne","mnemonic");
		inherent.put("tlt","mnemonic");
		inherent.put("tgt","mnemonic");
		inherent.put("tle","mnemonic");
		inherent.put("tge","mnemonic");
		inherent.put("INHERENT_END","mnemonic");
		
	
		//all key token immediate 
		immediate.put("IMMEDIATE_BEGIN","label"); //doesnt say if label ? guessing its a label though
		immediate.put("br.i5","label");
		immediate.put("brf.i5","label");
		immediate.put("enter.u5","FctInfo");
		immediate.put("ldc.i3","int");
		immediate.put("addv.u3","int");
		immediate.put("ldv.u3","int");
		immediate.put("stv.u3","int");
		immediate.put("IMMEDIATE_END","label"); //doesnt say if label ? guessing its a label though
		
		//all key-token relative
		relative.put( "RELATIVE_BEGIN","label") ;
		relative.put( "addv.u8","int") ;
		relative.put( "ldv.u8","int") ;
		relative.put( "stv.u8","int") ;
		relative.put( "inc.u8","int") ;
		relative.put( "decv.u8","int") ;
		relative.put( "ebter.u8","int") ;
		relative.put( "lda.i16","int") ;
		relative.put( "ldc.i8","int") ;
		relative.put( "lda.i16","int") ;
		relative.put( "ldc.i32","int") ;
		relative.put( "br.i8","label") ;
		relative.put( "br.i16","label") ;
		relative.put( "brf.i8","label") ;
		relative.put( "calls.i16","label") ; //change call to calls?
		relative.put( "trap","int") ;
		relative.put( "LAST","int") ; //not sure if int or label 
		relative.put( "RELATIVE_END","label") ;
		
	    //All key-Binary pairs
		BinTable.put("halt","000 00000");
		BinTable.put("pop","000 00001");
		BinTable.put("dup","000 00010");
		BinTable.put("exit","000 00011");
		BinTable.put("ret","000 00100");
		BinTable.put("not","000 01100");
		BinTable.put("and","000 01101");
		BinTable.put("or","000 01110");
		BinTable.put("xor","000 01111");
		BinTable.put("neg","000 10000");
		BinTable.put("inc","000 10001");
		BinTable.put("dec","000 10010");
		BinTable.put("add","000 10011");
		BinTable.put("sub","000 10100");
		BinTable.put("mul","000 10101");
		BinTable.put("div","000 10110");
		BinTable.put("rem","000 10111");
		BinTable.put("shl","000 11000");
		BinTable.put("shr","000 11001");
		BinTable.put("teq","000 11010");
		BinTable.put("tne","000 11011");
		BinTable.put("tlt","000 11100");
		BinTable.put("tgt","000 11101");
		BinTable.put("tle","000 11110");
		BinTable.put("tge","000 11111");
	
		//All key-hex pairs
		//inherent starts here
		HexTable.put("INHERENT_BEGIN","00");
		HexTable.put("halt","00");
		HexTable.put("pop","01");
		HexTable.put("dup","02");
		HexTable.put("exit","03");
		HexTable.put("ret","04");
		HexTable.put("RFU1","05");
		HexTable.put("RFU2","06");
		HexTable.put("RFU3","07");
		HexTable.put("RFU4","08");
		HexTable.put("RFU5","09");
		HexTable.put("RFU6","0A");
		HexTable.put("RFU7","0B");
		HexTable.put("not","0C");
		HexTable.put("and","0D");
		HexTable.put("or","0E");
		HexTable.put("xor","0F");
		HexTable.put("neg","10");
		HexTable.put("inc","11");
		HexTable.put("dec","12");
		HexTable.put("add","13");
		HexTable.put("sub","14");
		HexTable.put("mul","15");
		HexTable.put("div","16");
		HexTable.put("rem","17");
		HexTable.put("shl","18");
		HexTable.put("shr","19");
		HexTable.put("teq","1A");
		HexTable.put("tne","1B");
		HexTable.put("tlt","1C");
		HexTable.put("tgt","1D");
		HexTable.put("tle","1E");
		HexTable.put("tge","1F");
		HexTable.put("INHERENT_END","1F");
		//immediate starts here
		HexTable.put("IMMEDIATE_BEGIN","30");
		HexTable.put("br","30");
		HexTable.put("brf","50");
		HexTable.put("enter","70");
		HexTable.put("ldc","90");
		HexTable.put("addv","98");
		HexTable.put("ldv","A0");
		HexTable.put("stv","A8");
		HexTable.put("IMMEDIATE_END","AF");
		//Relative Starts here
		HexTable.put("RELATIVE_BEGIN","B0");
		HexTable.put("lda","D5");
		HexTable.put("call","E7");
		HexTable.put("trap","FF");
		HexTable.put("RELATIVE_END","FF");
		HexTable.put("LAST","FF");
		

		//all lower bounds of fields
		lower.put(".u3",0.0);
		lower.put(".i3",-4.0);
		lower.put(".u4",0.0);
		lower.put(".i4",-8.0);
		lower.put(".u5",0.0);
		lower.put(".i5",-16.0);
		lower.put(".u8",0.0);
		lower.put(".i8",-128.0);
		lower.put(".u16",0.0);
		lower.put(".i16",-32768.0);
		lower.put(".u32",0.0);
		lower.put(".i32",-2147483648.0);
		
		//all upper bounds of fields
		upper.put(".u3",7.0);
		upper.put(".i3",3.0);
		upper.put(".u4",15.0);
		upper.put(".i4",7.0);
		upper.put(".u5",31.0);
		upper.put(".i5",15.0);
		upper.put(".u8",255.0);
		upper.put(".i8",127.0);
		upper.put(".u16",65535.0);
		upper.put(".i16",32767.0);
		upper.put(".u32",4294967295.0);
		upper.put(".i32",2147483647.0);
	}
	
	
	

	public String getToken(String key) {
		if ( containsInherent( key))
			return inherent.get(key) ;
		else if ( containsImmediate(key)) 
				return immediate.get(key) ;
		else return relative.get(key) ;
		
	}
	public String getBin(String key) {
		return BinTable.get(key);
		
	}
	public String getHex(String key) {

		return HexTable.get(key);
	}
	
	public boolean containsInherent(String key) {
		
		return inherent.containsKey(key);
	}
	public boolean containsRelative(String key) {
		
		return relative.containsKey(key);
	}
	public boolean containsImmediate(String key) {
		return immediate.containsKey(key);
	}
	public double getupper(String key) { 
		return upper.get(key);
	}
	
	public double getlower(String key) { 
		return lower.get(key);
	}
/* Some sample code to test this class in main
 * SymTable ST = new SymTable();
		
		System.out.println(ST.getToken("xor"));
		System.out.println(ST.getBin("xor"));
		System.out.println(ST.getHex("xor"));
		System.out.println(ST.containsInherent("xor"));
 */
 
	
}

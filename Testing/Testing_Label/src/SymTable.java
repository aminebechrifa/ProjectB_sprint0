import java.util.HashMap;
import java.util.Map;

public class SymTable {
	Map<String, String> inherent = new HashMap<String,String>();
	Map<String, String> immediate = new HashMap<String,String>();
	Map<String, String> BinTable = new HashMap<String,String>();
	Map<String, String> HexTable = new HashMap<String,String>();
	
	Map<String, Double> lower = new HashMap<String,Double>();
	Map<String, Double> upper = new HashMap<String,Double>();
	

	public SymTable() {
		//All key-token pairs
		inherent.put("halt","mnemonic");
		inherent.put("pop","mnemonic");
		inherent.put("dup","mnemonic");
		inherent.put("exit","mnemonic");
		inherent.put("ret","mnemonic");
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
		inherent.put("halt","mnemonic");
		
		//all key token immediate 
		immediate.put("add","mnemonic");
		immediate.put("addv","mnemonic");
		immediate.put("and","mnemonic");
		immediate.put("br","mnemonic");
		immediate.put("brf","mnemonic");
		immediate.put("call","mnemonic");
		immediate.put("dec","mnemonic");
		immediate.put("decv","mnemonic");
		immediate.put("div","mnemonic");
		immediate.put("dup","mnemonic");
		immediate.put("enter","mnemonic");
		immediate.put("halt","mnemonic");
		immediate.put("inc","mnemonic");
		immediate.put("incv","mnemonic");
		immediate.put("ldc","mnemonic");
		immediate.put("ldv","mnemonic");
		immediate.put("mul","mnemonic");
		immediate.put("neg","mnemonic");
		immediate.put("not","mnemonic");
		immediate.put("or","mnemonic");
		immediate.put("pop","mnemonic");
		immediate.put("rem","mnemonic");
		immediate.put("ret","mnemonic");
		immediate.put("shl","mnemonic");
		immediate.put("shr","mnemonic");
		immediate.put("sub","mnemonic");
		immediate.put("stv","mnemonic");
		immediate.put("teq","mnemonic");
		immediate.put("tge","mnemonic");
		immediate.put("tgt","mnemonic");
		immediate.put("tlr","mnemonic");
		immediate.put("tlt","mnemonic");
		immediate.put("tne","mnemonic");
		immediate.put("trap","mnemonic");
		immediate.put("xor","mnemonic");
		
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
		HexTable.put("halt","00");
		HexTable.put("pop","01");
		HexTable.put("dup","02");
		HexTable.put("exit","03");
		HexTable.put("ret","04");
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
		HexTable.put("br","30");
		HexTable.put("brf","50");
		HexTable.put("enter","70");
		HexTable.put("ldc","90");
		HexTable.put("addv","98");
		HexTable.put("ldv","A0");
		HexTable.put("stv","A8");

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
		else return immediate.get(key) ;
		
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

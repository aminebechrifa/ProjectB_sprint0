import java.util.HashMap;
import java.util.Map;

public class SymTable {
	Map<String, String> SymbolTable = new HashMap<String,String>();
	Map<String, String> BinTable = new HashMap<String,String>();
	Map<String, String> HexTable = new HashMap<String,String>();
	
	
	
	public SymTable() {
		//All key-token pairs
		SymbolTable.put("halt","mnemonic");
		SymbolTable.put("pop","mnemonic");
		SymbolTable.put("dup","mnemonic");
		SymbolTable.put("exit","mnemonic");
		SymbolTable.put("ret","mnemonic");
		SymbolTable.put("not","mnemonic");
		SymbolTable.put("and","mnemonic");
		SymbolTable.put("or","mnemonic");
		SymbolTable.put("xor","mnemonic");
		SymbolTable.put("neg","mnemonic");
		SymbolTable.put("inc","mnemonic");
		SymbolTable.put("dec","mnemonic");
		SymbolTable.put("add","mnemonic");
		SymbolTable.put("sub","mnemonic");
		SymbolTable.put("mul","mnemonic");
		SymbolTable.put("div","mnemonic");
		SymbolTable.put("rem","mnemonic");
		SymbolTable.put("shl","mnemonic");
		SymbolTable.put("shr","mnemonic");
		SymbolTable.put("teq","mnemonic");
		SymbolTable.put("tne","mnemonic");
		SymbolTable.put("tlt","mnemonic");
		SymbolTable.put("tgt","mnemonic");
		SymbolTable.put("tle","mnemonic");
		SymbolTable.put("tge","mnemonic");
		SymbolTable.put("halt","mnemonic");
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
		
	}

	public String getToken(String key) {
		return SymbolTable.get(key);
		
	}
	public String getBin(String key) {
		return BinTable.get(key);
		
	}
	public String getHex(String key) {
		return HexTable.get(key);
	}
	
	public boolean containsInherent(String key) {
		return SymbolTable.containsKey(key);
	}
	
/* Some sample code to test this class in main
 * SymTable ST = new SymTable();
		
		System.out.println(ST.getToken("xor"));
		System.out.println(ST.getBin("xor"));
		System.out.println(ST.getHex("xor"));
		System.out.println(ST.containsInherent("xor"));
 */
 
	
}

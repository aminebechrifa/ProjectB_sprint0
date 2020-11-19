import java.util.ArrayList;

public interface ISymbolTable {
	
	public String getToken(String key) ;
	public String getBin(String key);
	public String getHex(String key) ;
	
	public boolean containsInherent(String key) ;




}

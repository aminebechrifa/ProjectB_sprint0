import java.util.ArrayList;

public class ErrorReporter implements IReportable {
	ArrayList<String> _ERROR ;
	boolean errors=false ; 
	public ErrorReporter() { 
	_ERROR=new ArrayList<String>() ;
}

	public void record(String str, Position pos) {
		errors=true ;
		_ERROR.add(str+ " : L  "+ pos.getLinepos() +" , Col :  "+ pos.getColpos() ) ;
		
	}


	
	
	public String getErrors() { 
		String str="" ;
		for (String var : _ERROR) { 
			str=str+var+"\n";
		}
		return str ;
	}

}

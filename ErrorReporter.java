import java.util.ArrayList;

public class ErrorReporter implements IReportable {
	ArrayList<String> _ERROR ;

	public ErrorReporter() { 
	_ERROR=new ArrayList<String>() ;
}

	public void record(String str, Position pos) {
		_ERROR.add(str+ " : L  "+ pos.getLinepos() +" , Col :  "+ pos.getColpos() ) ;
		
	}


	
	
	public String getErrors() { 
		String str="s" ;
		for (String var : _ERROR) { 
			str=str+var+"\n";
		}
		return str ;
	}

}

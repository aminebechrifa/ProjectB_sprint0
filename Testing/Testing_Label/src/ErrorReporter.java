import java.util.ArrayList;
// error reporter class to report the potential errors in the file we read 

public class ErrorReporter implements IReportable {
	static ArrayList<String> _ERROR ;// errors will be recorded in an arrayList 
	static boolean errors=false ;  // there is an error or not 
	
	public ErrorReporter() { 
	_ERROR=new ArrayList<String>() ;
}

	// method record add the errors and their positions as a string in the ArrayList 
	public void record(String str, Position pos) {
		errors=true ;
		_ERROR.add(str+ " : L  "+ pos.getLinepos() +" , Col :  "+ pos.getColpos() ) ;
		
	}

// method getErrors returns the errors recorded in the ArrayList storing all the errors 
	public String getErrors() { 
		String str="" ;
		for (String var : _ERROR) { 
			str=str+var+"\n";
		}
		return str ;
	}
public static void labelerror(String str, int pos) {
		errors=true ;
		_ERROR.add("no corresponding declaration to the label : "+ str +" : L  "+ pos ) ;
		
	}
}

import java.util.ArrayList;

// class Label : for now we will assume that if a token is not a nemonic we throw an error even if it is a label 
// label will be further developed in the next sprints 
public class Label {
String label ;
static ArrayList<String> existing=new ArrayList<String>() ;
public Label(String str) { 
	existing.add(str ) ;
	label=str ;
}
public String tostring() { 
	
	return label ;
}
}

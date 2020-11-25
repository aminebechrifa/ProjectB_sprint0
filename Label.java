import java.util.ArrayList;

// class Label : for now we will assume that if a token is not a nemonic we throw an error even if it is a label 
// label will be further developed in the next sprints 
public class Label {
String label ;
int pos ;
int ope=0 ;
static ArrayList<String> existing=new ArrayList<String>() ;
static ArrayList<Integer> poexisting=new ArrayList<Integer>() ;
static ArrayList<Integer> isoperand=new ArrayList<Integer>() ;
public Label() {
	label=null ;
}
public Label(String str , int po) { 
	existing.add(str ) ;
	poexisting.add(po) ;
	isoperand.add(0) ;
	label=str ;
	pos=po ;
}
public Label(String str , int po,int op) { 
	existing.add(str ) ;
	poexisting.add(po) ;
	isoperand.add(op) ;
	ope=op ;
	label=str ;
	pos=po ;
}
public String tostring() { 
	
	return label ;
}



public static void  setoff() { 
	int i=0 ;
	for (int j : isoperand ) { 
		i++ ; 
		if (j==1) { 
			int off=getoff(i) ;
		}
	}
	
	
	
}
public static void print() { 
	for (int i=0 ; i<existing.size() ; i++) { 
		System.out.print(existing.get(i)+"  "+poexisting.get(i)+"  "+isoperand.get(i)+"  \n");
	}
}
	public static int getoff(int i) { 
		String operand=existing.get(i) ;
		for (int j=0 ; j<=existing.size() ; j++ ) { 
	if (existing.get(j)!=null) 	{	
	if ((operand.contentEquals(existing.get(j)))
			&& (isoperand.get(j)==0))
	{ 
		return (-poexisting.get(i)+poexisting.get(j)) ;
	}}
		}
		
		ErrorReporter.labelerror(operand, poexisting.get(i));
	return 0 ;
		
	}



}

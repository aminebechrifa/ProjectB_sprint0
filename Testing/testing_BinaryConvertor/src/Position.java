// Class position to be used in the error reporting 

public class Position {
	// a position has a column and a line 
	public Position(int l, int c  ) { 
		  linepos=l; 
		  colpos=c ;
	}
 int linepos ; 
 int colpos ;
 
 // accessors for line and colums of object position :
 
public int getLinepos() {
	return linepos;
}
public void setLinepos(int linepos) {
	this.linepos = linepos;
}
public int getColpos() {
	return colpos;
}
public void setColpos(int colpos) {
	this.colpos = colpos;
}
 
 
 
 
}

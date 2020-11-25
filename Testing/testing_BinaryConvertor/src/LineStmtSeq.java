import java.util.ArrayList;
// LineStmtSeq contain a sequence(array list ) of the lines from the Source file 
public class LineStmtSeq {
ArrayList<LineStmt> lines ;
public LineStmtSeq( ) {
lines =new ArrayList<LineStmt>()  ;

}

// adding a line from source file to the array list 
public void add(LineStmt parseLineStmt) {
	
	lines.add(parseLineStmt) ;
	
}

public void settoff(int i , int off ) {
	
	lines.get(i).setoffset(off); ;
	
}


}

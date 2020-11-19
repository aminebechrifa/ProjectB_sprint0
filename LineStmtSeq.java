import java.util.ArrayList;

public class LineStmtSeq {
ArrayList<LineStmt> lines ;
public LineStmtSeq( ) {
lines =new ArrayList<LineStmt>()  ;

}

public void add(LineStmt parseLineStmt) {
	
	lines.add(parseLineStmt) ;
	
}
}

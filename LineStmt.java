// class lineStmt 
public class LineStmt  extends node {
	// each line statemetn can optionally be a label, an instruction, a comment ..
// assuming instruction or directive are going to be stored in inst ;
	 Label        label = null;
     Instruction  inst = null;
     Comment      comment = null;
     int 	adress ;
	public LineStmt(Label label, Instruction inst, Comment comment) {
		super();
		this.label = label;
		this.inst = inst;
		this.comment = comment;
	}





}

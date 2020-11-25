// class lineStmt 
public class LineStmt  extends node {
	// each line statemetn can optionally be a label, an instruction, a comment ..
// assuming instruction or directive are going to be stored in inst ;
	 Label        label = null;
     Instruction  inst = null;
     Comment      comment = null;
     int 	offset ;
     
	public LineStmt(Label label, Instruction inst, Comment comment) {
		super();
		this.label = label;
		this.inst = inst;
		this.comment = comment;
	}

public String tostring() { 
	return  label.tostring() +' '+inst.tostring()+' '+comment.tostring()+"       "+offset;
}

public  void setoffset(int off) { 
	offset=off ;
}
public boolean writable() { 
	return (!(label.label==null)&& !(inst.mnemonic==null)) ;
}
public boolean biwritable() { 
	return ( !(inst.mnemonic==null)) ;
}


public String getcomment() { 
	return comment.tostring() ;
}
public String getmnemonic() { 
	return inst.mnemonic ;
}
public String getoperand() { 
	return inst.operand ;
}


public String getlabel() { 
	return label.label ;
}
public String getoffset() { 
	return String.valueOf(offset) ;
}



}

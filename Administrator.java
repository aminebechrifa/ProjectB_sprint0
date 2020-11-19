
public class Administrator {
	String filename ;
	Administrator(String[] args){ 
		for ( String a : args) {
			if (a=="-h")
				Help.enable();
			if (a=="-v")
				Verbose.enable();
			if (a=="-l")
				listing.enable();
			else filename=a ;
			
			
		}
	}

}

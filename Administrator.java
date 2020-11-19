// class administrator to hendle the options in the command line 
public class Administrator {
	String filename ;
	Administrator(String[] args){ 
		for ( String a : args) {
			if (a=="-h") // help
				Help.enable();
			if (a=="-v") // verbose 
				Verbose.enable();
			if (a=="-l") // listing
				listing.enable();
			else filename=a ;
			
			
		}
	}

}

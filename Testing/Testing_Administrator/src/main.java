
public class main {

	public static void main(String[] args) {
		String[] arg= {"-l","-h","filename"} ;
		args=arg ;
		Administrator admin=new Administrator(args) ;
		System.out.print("Test Administrator\n") ;
	//expected 
		System.out.println(true +" "+false +" "+ true +"\n") ;
		// real output
		
		System.out.println(Help.help +" "+ Verbose.verbose +" "+ listing.lst+"\n") ;
		//


	}

}

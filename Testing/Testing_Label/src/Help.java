// class help to handle option -h 
public class Help {
static boolean help=false ;// true== option enabled, false== option disabled
static String message= " the helping message \n" ; 

// constructor: if help object is created, -h is enabled
static void enable() { 
	help=true ;
}

//returning the help message
static void helping() { 
	if (help)
	System.out.print(message) ;
}
}

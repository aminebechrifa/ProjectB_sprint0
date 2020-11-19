
public class Help {
static boolean help=false ;
static String message= " the helping message \n" ; 
static void enable() { 
	help=true ;
}
static void helping() { 
	if (help)
	System.out.print(message) ;
}
}

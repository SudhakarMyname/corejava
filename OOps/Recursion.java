package OOps;

public class Recursion {

	
	    static int ctr = 1;
	    
	    public static void showNumber() {
	    	
	    	if ( ctr <= 10 ) {
	    		System.out.println(ctr);
	    		ctr++;
	    		showNumber();
	    	}
	    	
	    }
	
	    public static void main(String[] args) {
	    
	    	showNumber();
	}}

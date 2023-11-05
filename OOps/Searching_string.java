package OOps;
import java.util.*;
public class Searching_string {

	public static void main(String[] args) {
		String [] arr = {"Rakesh","Hemant","Arun","Kapil","Imran","Kuldeep"};
		Scanner sc = new Scanner (System.in);
		
	System.out.println("Enter your name:");
	String name = sc.nextLine();
	boolean found = false ;
	
	for(int i=0 ; i<arr.length ; i++ ) {
		
		if(arr[i].equals(name)) {	
	System.out.println("Name found ");
	found = true;
	break;
    	}
		}
	if (!found) {
		System.out.println("Name Not Found");
	}
	}
}

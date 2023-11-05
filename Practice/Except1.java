package Practice;

public class Except1 {

	public static void main(String[] args) {
		
		try {
	     System.out.println(new Excep().add(-1,2)); 
	}
		catch(ArithmeticException  ex){
			System.out.println(ex);
		}
		System.out.println("program");
	}}

package Practice;

public class block {

	public static void show() 
	{
		{int num =10;
		System.out.println("Inner block is executed");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		System.out.println("Main method called");
		
		
		
	}
	
	static {
		System.out.println("static block is first");
	}
}

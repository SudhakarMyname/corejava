package Practice;
import java.util.*;
public class Ap {

	public static void main(String[] args) {
		
		System.out.println("execution begins");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			
			int res =new D().add(num1,num2);	
			
		}
		catch (Negative ex)
		{
			System.out.println(ex);
		}
		
		System.out.println("exection ends");
	}

}

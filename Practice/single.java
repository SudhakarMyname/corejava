package Practice;

public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] x= {10,20,30};
		int y = 0;
		
		try {
			
			int z = x[2]/y;
			System.out.println(z);
		}
		catch(Exception ex)
		{
			System.out.println("0 entered");
		}
		finally
		{
			System.out.println("Close connections");
		}
		System.out.println("Execution ends");
	}

}

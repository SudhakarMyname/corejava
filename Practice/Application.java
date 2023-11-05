package Practice;

public class Application {

	public static void main(String[] args) {
		
		Products p1 = new Products (101, "Mouse" , "Logitech", 1500);
		Products p2 = new Products (102, "Mouse" , "HP", 2500);

		boolean res = p1.equals(p2);
		System.out.println(res);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}

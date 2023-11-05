package Practice;

public class ProductApp {

	public static void main(String[] args) {
		
	Product p1 = new Product (101, "Mouse" , "Logitech" , 1500);
	Product p2 = new Product (102 , "Mouse" , "Dell", 1900);
		
	int n = p1.compareTo(p2);	
	System.out.println(n);
	
	System.out.println(p1);
	}

}

package Practice;

public class Products {

	private int pid;
	private String name;
	private String brand;
	private int price;
	
	public Products() {}
	
	public Products( int pid , String name , String brand , int price)
	{
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		
		Products obj1 = (Products) obj;
		boolean res = (this.name) == obj1.name;
		return res;
	}
	
	public String toString() {
		

		return  pid + ","+ name + ","+ brand + "," + price ;
		
		
	}
	
	
}

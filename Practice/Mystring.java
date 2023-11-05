package Practice;

public class Mystring {

	private int num;
	
	public Mystring (int num) {
		this.num = num;
	}
	public String toString()
	{
		return String.valueOf(num);
	}
	public boolean equals(Object obj)
	{
		Mystring obj1 = (Mystring) obj;
		boolean res = (this.num == obj1.num);
//		System.out.println(this.num);
//		System.out.println(obj1.num);
		return res; 
	}
}
	
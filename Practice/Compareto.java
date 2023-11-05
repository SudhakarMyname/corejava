package Practice;

public class Compareto {
	
	public static void main(String[] args) {
		Mystring str1 = new Mystring(10);
		Mystring str2 = new Mystring(10);
		
		boolean res1 = str1 ==  str2 ;
		boolean res2 = str1.equals(str2);
		
		System.out.println(res1);
		System.out.println(res2);

	}

}

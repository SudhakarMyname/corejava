package Practice;

public class D {

 public int add(int num1,int num2)
 {
	 if ( num1 < 0 || num2 < 0)
	 {
		 Negative ex = new Negative("nos are negative");
		 
		 throw ex;
	 }
	 return num1+num2;
 }
	
}

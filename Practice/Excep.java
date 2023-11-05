package Practice;

public class Excep {
	
	public int add(int num1,int num2)throws ArithmeticException   {
		if(num1 <0 || num2 <0) {
			ArithmeticException except = new ArithmeticException("Numbers are Negative");
			
			throw except;}
		
			return num1+num2;
			
		}
	}



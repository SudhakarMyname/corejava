package Practice;

public interface B {

	static void method()
	{
		System.out.println("welcome");
	}
	default void method2()
	{
		method();
	}
	public static void main(String[] args) {
		
		method();
	}
}

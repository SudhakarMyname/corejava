package OOps;

public class Person {
	
	    private String name;

	    public Person(String name) {
	        this.name = name;
	    }

	    public void printName() {
	        System.out.println("My name is " + this.name);
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("hello");
		Person obj=new Person("Ram");
		obj.printName();
		
		
	}

}

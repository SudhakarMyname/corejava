package Practice;

class Animal{
	
	 void show(){
		System.out.println("Animal is eating");
	}
}
class cat extends Animal{
	
	void show() {
		System.out.println("cat is eating");
	}
	
}


public class type {
	public static void main(String[] args) {
		
	
	//upcasting
	
		Animal ani = new cat();	

	ani.show();
	
	//downcasting
	
	cat obj2 =(cat) new Animal();
	
	
	
	
	}
}

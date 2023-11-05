package OOps;

public class NoInstance {

	private int age;
	
	NoInstance(){
		this (90);
	}
	
	NoInstance(int age){
	show();
	
	//	System.out.println(this.age);
	}
	void show() {
	//	NoInstance obj2=new NoInstance();
		System.out.println("method called");
		
	}
      int showv() {
		return age;
	}
	static void sho() {
		 
	}
	
	
	
}

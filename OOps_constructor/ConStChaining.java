package OOps_constructor;

public class ConStChaining {
	
	public ConStChaining () {
		this (88);
		System.out.print(1);
	}
	public ConStChaining(int a) {
		this ("Noida");
		System.out.println(2);
	}
	public ConStChaining(String Name) {
		System.out.println("here chains completes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new ConStChaining();
	}

}

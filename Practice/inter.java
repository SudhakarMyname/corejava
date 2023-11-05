package Practice;

public class inter implements one,phone {
	


	public static void main(String[] args) {
		inter obj = new inter();
		obj.takephoto();
		obj.pickupcall();
		add();

	}

	@Override
	public void takephoto() {
		
		System.out.println("Photo has been taken");
		
	}

	@Override
	public void pickupcall() {
		
		System.out.println("Phone has been pickuped");
	}
	
	public static void add() {
		System.out.println("Added");
	}
	
}

package OOps_constructor;

public class CopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyClass obj1= new CopyClass(101,"sanu","sanu123") ;
		CopyClass obj2 = new CopyClass(obj1);
				obj2.show();
	}

}

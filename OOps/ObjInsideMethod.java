package OOps;

public class ObjInsideMethod {

static int num=4;
	
	int n=3;
	
	public static  void fact() {
		System.out.println(num);
		
		ObjInsideMethod x= new ObjInsideMethod();
		System.out.println(x.n);
		
	}
	
	public static void main(String[] args) {
		
		fact();
		
	}

}
package OOps;

public class Rec_Facto {

	
	public static int fact(int num) {
		
		if (num==1) {
			return 1 ;}
			else {
				return num*fact(num-1);
			}
	}

	public static void main(String[] args) {
		System.out.println(fact(6));
	}

}

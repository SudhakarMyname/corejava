package Assignment2_Patterns;

public class Pattern12 {

	public static void main(String[] args) {
	
		int num=5;
		char ch='A';
		for(int i=0; i<num; i++) {
			
		for(int j=0; j<=i;j++) {
			
			System.out.print(ch+ " ");
			ch++;
		}
		System.out.println();
		}

	}

}

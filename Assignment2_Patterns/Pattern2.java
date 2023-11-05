package Assignment2_Patterns;


// SECOND PATTERN

public class Pattern2 {
	
	public static void main(String[] args) {
		int num=5;
		int a=65;
		for(int i=0; i<num;i++) {
			for(int j=num-i; j>1 ; j--) {
				System.out.print("  ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print((char)a+" ");
				a++;
			}
			System.out.println();
		}
	
	}

}

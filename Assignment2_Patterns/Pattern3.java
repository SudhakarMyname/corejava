package Assignment2_Patterns;


// PATTERN THREE

public class Pattern3 {

	public static void main(String[] args) {
		int num=5;
		
		for(int i=0 ; i<num ; i++) {
			for(int j=num-i; j>1;j--) {
				
				System.out.print("  ");
			}
			for(int k=0 ; k<=i; k++) {
				System.out.print("* ");
			}
			if(i>=1)
			for(int l=0; l<i; l++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

package Assignment2_Patterns;

//PATTERN FOUR

public class Pattern4 {

	public static void main(String[] args) {
		
		int num=5;
		
	for(int i=0 ; i<num;i++) {
		for(int j=1;j<num-i;j++) {
			
			System.out.print("  ");
			
		}
		for(int j=0; j<=i ;j++) {
			System.out.print("* ");
		}
		if(i>=1) {
		for(int j=1; j<=i ; j++) {
			System.out.print("* ");
		}}
		System.out.println();
	}
	for(int i=1 ; i<num; i++) {
		for(int j=0;j<i;j++) {
			System.out.print("  ");
		}
		for(int j=0 ; j<num-i; j++) {
			System.out.print("* ");
		}
		if(i>=1)
		for(int j=1; j<num-i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}			
	}
}

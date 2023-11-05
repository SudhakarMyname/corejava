package Assignment2_Patterns;

//PATTERN ELEVEN

public class Pattern11 {

	public static void main(String[] args) {
		
		int num=5;
		
	for(int i=0; i<num; i++) {
		if(i<num-1) {
		for(int j=0; j<i; j++) {
			
			System.out.print(" ");
			
		}
		for(int j=0; j<1;j++) {
			System.out.print(" *");
		}
		for(int j=1; j<num-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<num-i;j++) {
			System.out.print(" ");
		}
		
		for(int j=0;j<1;j++) {
			System.out.print(" *");
		}
		}
		else {
			for(int j=0;j<num;j++) {
			System.out.print(" ");}
			System.out.print(" *");
		}
		
		System.out.println();
	}
	for(int i=0;i<num-1;i++) {
		for(int j= 0; j<num-i-1;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<1;j++) {
			System.out.print("*");
		}
		for(int j=0; j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=0; j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<1;j++) {
			System.out.print(" *");
		}
		System.out.println();
	}		
	}
}

package Assignment2_Patterns;

//PATTERN NINE

public class Pattern9 {

	public static void main(String[] args) {
	int num=5;
	
	for(int i=0; i<num; i++) {
		
	for(int j=0;j<num-i;j++) {
				
		System.out.print("* ");
		if(j>0) {
			for(int k=0;k<j;k++) {
				System.out.print(" ");
			}
		
		
		}
	}
	System.out.println();
		
	}
	
	}

}

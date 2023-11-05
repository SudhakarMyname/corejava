package Assignment2_Patterns;

//PATTERN TEN

public class Pattern10 {

	public static void main(String[] args) {
		int num=5;
		
		
	
		for(int i=0; i<num; i++) {
	
			int digit=65;
			int sum=0;
			for(int j=0; j<num-i;j++) {
				
				System.out.print((char)digit+" ");
				sum++;
				
				digit=digit+sum;
					}
			System.out.println();
			
			
		}
		

	}

}

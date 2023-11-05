package Assignment2_Patterns;

//PATTERN SEVEN

public class Pattern7 {

	public static void main(String[] args) {
	
		int num=5;
		
		for(int i=0; i < num;i++) {
			
	for(int j=num-i-1;j>0;j--) {
		System.out.print("  ");
	}
	for(int j=i+1;j>0;j--) {
		System.out.print(j+" ");
	}
	if(i>0) {
	for(int j=2;j<=i+1;j++) {
		System.out.print(j+" ");
	}}
	
	
			System.out.println();
		}

	}

}

package Assignment2_Patterns;

public class Pattern14 {

	public static void main(String[] args) {
		
		int num=5;
		
for(int i=1; i<=num; i++) {
			
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
for(int i=1;i<num;i++) {
	for(int j=num-i;j>0;j--) {
		System.out.print(j+" ");
	}
	System.out.println();
}
		
		
	}

}

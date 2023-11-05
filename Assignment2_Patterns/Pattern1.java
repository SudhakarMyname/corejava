package Assignment2_Patterns;

// PATTERN FIRST

public class Pattern1 {

	public static void main(String[] args) {
		int num=5;
		for( int i=1; i<=num; i++ ) {
			int ar = 64+num;
			for(int j=i; j<=num; j++ ) {
				System.out.print((char) ar+" " );
				ar--;
			}
				System.out.println();
						
		}

	}

}

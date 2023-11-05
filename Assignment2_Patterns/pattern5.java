package Assignment2_Patterns;

//PATTERN FIVE

public class pattern5 {

	public static void main(String[] args) {
		int num=5;
		int a=-1;
	for(int i=0;i<=num;i++) {
		
	for( int j=1; j<=num-i ; j++ ) {
		
		System.out.print(j+" ");	
	}	
	for(int k=-1; k<i-1 ; k++ ) {
		
		System.out.print("  ");
	}
		if( i > 1 ) {
	for(int j=1;j<i ;j++)
	{
		System.out.print("  ");
	}}	
	if(i==0) {
		for( int k= num-1-i; k >0 ; k--) {
			System.out.print(k+" ");
		}
	}else {
	for( int k=num-i ; k > 0 ; k--) {
		System.out.print(k+" ");
	}}
				System.out.println();
			}
}}

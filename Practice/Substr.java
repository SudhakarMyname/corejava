package Practice;

public class Substr {

	public static void main(String[] args) {
		String email = "sudhakarprasad.13.11@gmail.com";
		String str1 = email.substring(0,5);
		
		System.out.println(str1);
		
		String str2 = email.substring(email.length()-4);
		int x = email.length();
		
		int y = x-9;
		
	for( int i =0 ; i < y ; i++)
	{
		str1 = str1 + "*" ;
	}
		str1 = str1 + str2 ;
		System.out.println(str1);
	}

}

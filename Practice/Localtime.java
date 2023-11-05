package Practice;

import java.time.LocalDate;

public class Localtime {

	public static void main(String[] args) {
	
		LocalDate date = LocalDate.now();
		String str  = date.toString();
		System.out.println(date);
		
		String [] str1 = str.split("-");
		//System.out.println(str1);
		System.out.println(str1[2]+"-"+str1[1]+"-"+str1[0]);
		
		
	}

}

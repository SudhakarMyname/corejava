package Practice;

public class time {

	public static void main(String[] args) {
	String str1 = "12:30:60";
	String str2 = "12:60:00";
	String [] arr1 = str1.split(":");
	String [] arr2 = str2.split(":");
	
	int sec1 = Integer.parseInt(arr1[0])*3600 + Integer.parseInt(arr1[1])*60 + Integer.parseInt(arr1[2]); 
	int sec2 = Integer.parseInt(arr2[0])*3600 + Integer.parseInt(arr2[1])*60 + Integer.parseInt(arr2[2]); 
	
	int sec3 = sec2-sec1;
	
	String str3 = String.valueOf(sec3/3600) + ":" + String.valueOf((sec3%3600)/60) +":"+ String.valueOf(sec3%60) ;
	System.out.println(str3);

	}

}

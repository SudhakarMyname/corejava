package Practice;

public class TimeDiff 
{
	public static void main(String[] args) 
	{
		String str1 = "12:30:60";
		String str2 = "12:60:00";
		
	String [] arr1 = str1.split(":");
	String [] arr2 = str2.split(":");
	
	int hr1 = Integer.parseInt(arr1[0]);
	int hr2 = Integer.parseInt(arr2[0]);	
	int hrdiff = hr2-hr1;
	
	int min1 = Integer.parseInt(arr1[1]);
	int min2 = Integer.parseInt(arr2[1]);
	
	String hour = String.valueOf(hrdiff);
	String semi = ":";
	
	int sec1 = Integer.parseInt(arr1[2]);
	int sec2 = Integer.parseInt(arr2[2]);
	if(sec2 >= sec1) {
		if((sec2-sec1)==60)
		{
			String res = hour + semi + String.valueOf((min2 - min1)+1) + semi + 0;
			System.out.println(res);
		}
		else {
	String res1 = hour + semi + String.valueOf(min2 - min1) + semi + String.valueOf(sec2-sec1);
	System.out.println(res1);
	         }
		     }
	else {
	String res2 =  hour + semi + String.valueOf((min2-min1)-1) + semi+ String.valueOf((sec2+60)-sec1);
	System.out.println(res2);
		 }
}
}

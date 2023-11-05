package Practice;

public class App 
	{
	public static void main(String[] args) 
	{
		int arr [] = {1,9,3,4,5};
		
		int temp=-1;
		
		int max = arr[0] ;
	
	for(int i=1;i<5;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	for(int i=0; i<5 ; i++)
	{
		if(arr[i]>temp && arr[i] < max)
		{
			temp=arr[i];
		}
	}
	System.out.println(max);
	System.out.println(temp);
	Integer num = new Integer(10);
	System.out.println(num.toString());
	
	}
	}





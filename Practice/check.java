package Practice;
import java.io.*;
public class check {

	public static void main(String[] args) {
		
	System.out.println("Execution Begins");
	
	
		
	try {
		FileReader fr = new FileReader("c:\\npkey.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		while(str != null )
		{
			
			System.out.println(str);
		
		 	str= br.readLine();
		}
	}
	catch(FileNotFoundException ex)
	{
		
		System.out.println("file doesnt exist");
		
	}
	catch(IOException ex) 
	{
		
		System.out.println(ex);
	}
		
	
	System.out.println("Execution ends");	
	}

}

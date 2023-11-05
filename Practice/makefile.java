package Practice;

import java.io.*;

public class makefile {

	public static void main(String[] args) 
	{
		System.out.println("Execution begins");
		
		try {
			FileWriter fw = new FileWriter("aa.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("this is filwriter demo");
			pw.println("println() is a method of printwriter class");
			pw.print("print() is a method of printwriter class");
			pw.println("welcome");
			fw.close();
		}
		catch(FileNotFoundException ex)
		{
			System.err.println("specified file doesnt exist");
		}
		catch(IOException ex)
		{
			System.out.println(ex);
			
		}
		System.out.println("Execution ends");
	}

}

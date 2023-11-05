package Practice;

import java.util.ArrayList;

public class Arrylist3 {

	public static void main(String[] args) {

		
		ArrayList <String> list = new ArrayList<String> ();
		
		list.add("sanu");
		list.add("hemant");
		list.add("subodh");
		list.add("Himanshu");
		list.add("Imran");
		list.add("Imran");
		
		while(list.contains("Imran"))
		{
			list.remove("Imran");
		}

		System.out.println(list);
	}

}

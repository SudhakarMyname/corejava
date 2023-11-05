package Practice;

import java.util.*;

public class Arrylist4 {

	public static void main(String[] args) 
	{
		ArrayList <String> list = new ArrayList <String >();
		
		list.add("Rahul");
		list.add("Sanu");
		list.add("Kapil");
		list.add("Imran");
		list.add("Ankur");
		list.add("Subodh");

		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.isEmpty());
		for(String str : list)
		{
			System.out.println(str.toString());
		}
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}

}

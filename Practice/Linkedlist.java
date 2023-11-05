package Practice;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) 
	{
	
		LinkedList <String> list = new LinkedList<String>();
		
		list.add("Rahul");
		list.add("Amit");
		list.add("sanu");
		list.add("kapil");
		list.add("Abhishek");
		list.add(1,"manoj");
		list.addFirst("Abhishek s");
		list.addLast("Imran");
		list.add(1,"Hemant");
		list.add("Ankush");
		
		System.out.println(list);
			
	}

}

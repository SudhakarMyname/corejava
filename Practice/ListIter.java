package Practice;

import java.util.*;

public class ListIter {

	public static void main(String[] args) {
	
	ArrayList <String> list = new ArrayList<String>();
	
	list.add("Rahul");
	list.add("Kapil");
	list.add("Imran");
	list.add("Ankur");
	list.add("Imran");
	
		int x= list.size();
		ListIterator < String > itr = list.listIterator();
		while(itr.hasNext())
		{
			if(itr.next().contains("Imran"))
				itr.remove();
		}	
		System.out.println(list);
	}
}

package Practice;

import java.util.ArrayList;

public class Arrylist2 {

	public static void main(String[] args) {
	
	ArrayList <Object> list = new  ArrayList <Object>();
	
	list.add("Rahul");
	list.add("Rahul");
	list.add("Kapil");
	list.add("Imran");
	list.add("Rahul");
	list.add("sanu");
	list.add("Rahul");
	int a = list.size();
	for(int i=0 ; i < a	 ; i++) {	
	if(list.get(i).equals("Rahul"))
	{
		list.remove("Rahul");
		a--;
		i=0;
	}
	}
	System.out.println(list);
	}
}

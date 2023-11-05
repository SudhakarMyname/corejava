package Practice;

import java.util.*;
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <Emp> list = new ArrayList<Emp>();
	
	list.add(new Emp(101,"amit","sales",56000));
	list.add(new Emp(102,"sanu","politics",60000));		
			
	Emp e1 =list.get(1);
	System.out.println(e1);
//	System.out.println(e1.getDepartment());
//	System.out.println(e1.getEid());
//	System.out.println(e1.getName());
//	System.out.println(e1.getSalary());
		
	}

}

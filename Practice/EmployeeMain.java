package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		
	ArrayList <Employee> list = new ArrayList <Employee>();
	
	list.add(new Employee (101 ,"Amit"  , "sales" , 56000 ));
	list.add(new Employee (102 ,"Rahul" , "Marketing" , 51000 ));
	list.add(new Employee (103 ,"Imran" , "Accounts" , 59000 ));
	list.add(new Employee (104 ,"Suman" , "HR" , 80000));
	list.add(new Employee (105 ,"Kapil" , "sales" , 71000));
	list.add(new Employee (106 ,"manoj" , "sales" , 50000));
	list.add(new Employee (107 ,"Abhay" , "Marketing", 71000));
	
	int max  = list.get(0).getSalary();
	int x = list.size();
	int salary;
	for(int i=0; i<x ; i++)
	{
	salary = list.get(i).getSalary();
		if(salary > max)
			max = salary; 
	}
	System.out.println(max);
	int secmax = -1;
	for(int i=0; i<x ; i++)
	{
		salary =list.get(i).getSalary();
		if(salary > secmax && salary < max)
			secmax = salary;
	}
	System.out.println(secmax);
	
	
	for(int i=0 ; i < list.size();i++)
	{
		Employee e = list.get(i);
		if (max == e.getSalary() || secmax == e.getSalary()) {
			System.out.println(e);
		}
	}
	System.out.println("====================");
	for(Employee e : list)
	System.out.println(e);
	System.out.println("======================");
	for(Employee e : list)
	{
		if(e.getDepartment().equals("sales"))
		{
			System.out.println(e);
		}
	}
	System.out.println("========================");
	Collections.sort(list);
	for(Employee e : list )
	{
		System.out.println(e);
	}

	
//	Employee obj = list.get(0);
//	System.out.println(obj);
//	System.out.println(obj.getEid());
//	System.out.println(obj.getName());
//	System.out.println(obj.getDepartment());
//	System.out.println(obj.getSalary());
	}
}

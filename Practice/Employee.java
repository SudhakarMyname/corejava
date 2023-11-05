package Practice;

public class Employee implements Comparable<Employee> 
{
	private String name;
	private int eid;
	private String department;
	private int salary;
	
	public Employee(int eid , String name , String department , int salary)
	{
		this.eid = eid ;
		this.name = name ;
		this.department = department;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", department=" + department + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee a) {
		
		//int n = this.salary - a.salary;
		
		int n = this.name.compareTo(a.name);
		
		return n;
	}

	
	
	
}

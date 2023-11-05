package OOps_constructor;

public class ObjectClass {
     private int eid;
     private String name;
     private String department;
     private int salary;
     
     public ObjectClass(int a1, String a2, String a3, int a4) {
    	 eid=a1;
    	 name=a2;
    	 department=a3;
    	 salary=a4;
     }

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public void show() {
		
		System.out.println(eid);
		System.out.println(name);
		System.out.println(department);
		System.out.println(salary);
		System.out.println("===================================");
		
	}
     public static void main(String[] args) {
		
    	ObjectClass obj1,obj2,obj3;
    	
    	obj1= new ObjectClass(101,"rahul","sales",67000);
    	obj2= new ObjectClass(102,"karan","job",77000);
    	obj3= new ObjectClass(103,"sumit","marketing",87000);
    	 
    	 
    	 obj1.show();
    	 obj2.show();
    	 obj3.show();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}
     
     
     
}

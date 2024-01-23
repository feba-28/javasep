package oopspkg;

public class Employee {
	
	int empid;
	String empname;
	
	
	public Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee(101,"arya");
		emp.display();
		//System.out.println(emp.empid);
		//System.out.println(emp.empname);
		//or
		
		Employee emp2=new Employee(102,"Vivek");
				emp2.display();

		Accessmodifier ob=new Accessmodifier();
ob.b=10;
ob.c=50;

	}

}

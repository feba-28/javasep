package oopspkg;


class Member
{   
	String name;
	int age,salary;
	long phoneno;
	String address;
	
	public void printdetails()
	{
		System.out.println("Memner name="+name);
		System.out.println("Memner age="+age);
		System.out.println("Memner phoneno="+phoneno);
		System.out.println("Memner salary="+salary);
		System.out.println("Memner address="+address);
	}
	
}
class Employeee extends Member
{
	String specialization="Tester";
}

class Manager extends Member
{
	String department="HR";
}
public class Inheritencepgm {

	public static void main(String[] args) {
		
		Employeee emp = new Employeee();
		emp.name="Alok";
		emp.age=30;
		emp.phoneno=82817406;
		emp.salary=50000;
		emp.address="xyz";
	//	System.out.println(emp.department="testing")	BY MISS
		emp.printdetails();
		Manager m = new Manager();
		m.name="Anand";
		m.age=32;
		m.phoneno=82819897;
		m.salary=70000;
		m.printdetails();
		
		
	}

}

package controlstatements;

public class scanneremp {
	
	int empid; //instance variable
	String empdesignation;
	String empname;
	static String companyname="Luminar"; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanneremp emp1=new scanneremp();
		System.out.println(emp1.empid=101);
		System.out.println(emp1.empdesignation="Tester");
		System.out.println(emp1.empname="Anand");
		

	}
	public void salaryinfo()
	{
		int basicpay=100000; //local variable
		System.out.println("Salaryinformation");
	}

}

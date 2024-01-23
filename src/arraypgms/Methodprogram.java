package arraypgms;
import java.util.Scanner;
public class Methodprogram {

	public static void main(String[] args) {
		
		Methodprogram ob=new Methodprogram();
		Scanner sc= new Scanner(System.in);
				
		ob.add();
		int subresult=ob.sub();
		System.out.println("Difference="+subresult);
		ob.mul(40, 2);
		System.out.println("Enter values");
		int v1=sc.nextInt();
		int v2=sc.nextInt();
		int divresult=ob.div(v1, v2);
		System.out.println("Quotient="+divresult);
		

	}
	//method without returntype nad without prameters
	public void add()
	{
		int a=40,b=20,c;
		c=a+b;
		System.out.println("Sum ="+c);
	}
	
	//method with returntype and without parameters
	public int sub()
	{
		int a=30,b=20,c;
		c=a-b;
		return c;
	}
	
	//method without returntype and with parameters
	
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("Producr="+c);
	}
	
	//method with returntype and with parameters
	
	public int div(int a,int b)
	{
	int c=a/b;
	return c;
	}
	

}

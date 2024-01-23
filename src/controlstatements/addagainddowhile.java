package controlstatements;
import java.util.Scanner;
public class addagainddowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		char n;
		do
		{
			int a,b,c;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			System.out.println("Sum = "+c);
			System.out.println("Do you wish to continue(y/n)?);");
		    n=sc.next().charAt(0);
			
		} while(n=='Y'|| n=='y');

	}

}

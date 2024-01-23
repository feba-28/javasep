package controlstatements;
import java.util.Scanner;
public class scanSwitchCALCULATOR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		System.out.println("Enter your choice of operator: +,-,*,/");
		char s=sc.next().charAt(0);
		switch(s)
		{
		case '+' :  c=a+b;
					System.out.println("Sum of "+a+"and "+b+"="+c);
					break;
		case '-' :  c=a-b;
					System.out.println("Sum of "+a+"and "+b+"="+c);
					break;
		case '*' :  c=a*b;
					System.out.println("Sum of "+a+"and "+b+"="+c);
					break;
		case '/' :  c=a/b;
					System.out.println("Sum of "+a+"and "+b+"="+c);
					break;
		default :   System.out.println("Wrong choice");
		break;		
		}
	}
}

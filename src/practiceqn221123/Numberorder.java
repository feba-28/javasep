package practiceqn221123;
import java.util.Scanner;
public class Numberorder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		do {
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		System.out.println("Enter third number");
		int n3=sc.nextInt();
		
		if(n1<n2 && n2<n3)
		{
			System.out.println("increasing");
		}
		else if(n1>n2 && n2>n3)
		{
			System.out.println("decreasing");
		}
		else
		{
			System.out.println("neither increasing or decreasing");
		}
		
		System.out.println("Do you want to continue?");
		c=sc.next().charAt(0);
		}while(c=='y'||c=='Y');	
	}
}

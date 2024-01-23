package controlstatements;
import java.util.Scanner;
public class scanneradd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		int c=a+b;
		System.out.println("Sum of "+a+"and "+b+"= "+c);
		

	}

}

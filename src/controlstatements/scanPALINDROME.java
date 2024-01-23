package controlstatements;
import java.util.Scanner;
public class scanPALINDROME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int b=a;
		int r=0;
		int rev;
		while(a>0)
		{
			rev=a%10;
			r=(r*10)+rev;
			a=a/10;
		}
		if(r == b)
		{
			System.out.println(b+" is palindrome");
		}
		else
		{
			System.out.println(b+" is not palindrome");
		}

	}

}

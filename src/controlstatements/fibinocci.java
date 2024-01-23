package controlstatements;
import java.util.Scanner;
public class fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter limit");
		n=sc.nextInt();
		a=0;
		b=1;
		System.out.print(a+" "+b+" ");
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b; 
			b=c; 
			
		}
	}

}

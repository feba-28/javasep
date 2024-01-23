package practiceqn241123;
import java.util.Scanner;
public class Integersum {

	public int 	integersum(int n)
	{	int s=0;
		while(n>0)
		{
			int digit=n%10;
			s=s+digit;
			n=n/10;
		}
		return s;
	}
	public static void main(String[] args) {
		
		
		// Integer sum using method
		Integersum ob=new Integersum();
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer");
		int n=sc.nextInt();
		int num=n;
		int result=ob.integersum(n);
		System.out.println("Sum of digits of "+num+" is "+result);

	}

}

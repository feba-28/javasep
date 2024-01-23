package arraypgms;
import java.util.Scanner;
public class sumandaverage {

	public static void main(String[] args) {
		int[] ar=new int[4];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arraysize");
		int n=sc.nextInt();
			System.out.println("Enter numbers");
			
			
			int sum=0, avg;
			
			
			for(int j=0;j<n;j++)
			{
				ar[j]=sc.nextInt();
				sum+=ar[j];
				
			}
			avg=sum/n;
		
				System.out.println("Sum ="+sum);
				System.out.println("Average ="+avg);
			

	}

}

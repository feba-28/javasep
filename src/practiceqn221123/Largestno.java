package practiceqn221123;
import java.util.Scanner;
public class Largestno {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[10];
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter values to array");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
	    int large=ar[0];
		
		for(int i=0;i<n;i++)
		{
			if(ar[i]>large)
			{
				large=ar[i];
			}
			
		}
		System.out.println("Largest element is "+large);
		
		

	}

}

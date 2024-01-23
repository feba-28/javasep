package arraypgms;

import java.util.Scanner;

public class Printoddeven {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter rray size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Odd numbers:");
		for(int i=0;i<n;i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}
		System.out.println("Even numbers:");
		for(int i=0;i<n;i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
		

	}

}

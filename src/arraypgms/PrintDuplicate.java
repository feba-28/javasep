package arraypgms;

import java.util.Scanner;

public class PrintDuplicate {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Duplicate elements are:");
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				if((ar[i]==ar[j])&&(i!=j))
					System.out.println(ar[j]);
			}
	}

}

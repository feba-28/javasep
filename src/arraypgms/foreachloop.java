package arraypgms;

import java.util.Scanner;

public class foreachloop {

	public static void main(String[] args) {
		
		int[] ar=new int[4];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arraysize");
		int n=sc.nextInt();
			System.out.println("Enter numbers");
			
			for(int j=0;j<n;j++)
			{
				ar[j]=sc.nextInt();
				
			}
			for(int e:ar)
				System.out.println(e);

	}

}

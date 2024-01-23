package arraypgms;

import java.util.Scanner;

public class multidimensuinalarray {

	public static void main(String[] args) {
		
		int[][] ar= new int[3][2];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter values");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j]+" ");	
			}
			System.out.println();	
		}	

	}

}

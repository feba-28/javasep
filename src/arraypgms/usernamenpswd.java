package arraypgms;

import java.util.Scanner;

public class usernamenpswd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter row and column size");
		int n=sc.nextInt();
		int m=sc.nextInt();
		String[][] ar= new String[n][m];
	

		System.out.println("Enter username and password");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				ar[i][j]=sc.next();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(ar[i][j]+" ");	
			}
			System.out.println();	
		}

	}

}

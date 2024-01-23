package stringpkg;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter String");
		String str=sc.nextLine();
		int n=str.length();
		String rev=""; 
		for(int i=n-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println("Reversed string="+rev);
		
		

	}

}

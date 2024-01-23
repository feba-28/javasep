package stringpkg;

import java.util.Scanner;

public class Counchar {

	public static void main(String[] args) {
	
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		count=str.length();
		System.out.println("The number of characters in string="+count);

	}

}

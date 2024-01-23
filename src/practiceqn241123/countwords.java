package practiceqn241123;

import java.util.Scanner;

public class countwords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	    int wcount=words.length;
		System.out.println("The no of words in string is "+wcount);
		

	}

}

package stringpkg;
import java.util.Scanner;
import oopspkg.Accessmodifier;
public class Vowelcount extends Accessmodifier {

	public static void main(String[] args) {
		Accessmodifier ob=new Accessmodifier();
		Vowelcount ob1=new Vowelcount();
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			count++;	
		}
		System.out.println("Count of vowels="+count);
		
		ob1.c=60;
	}

}

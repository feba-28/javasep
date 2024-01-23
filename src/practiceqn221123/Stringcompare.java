package practiceqn221123;
import java.util.Scanner;
public class Stringcompare {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1");
		String s1=sc.nextLine();
		System.out.println("Enter string2");
		String s2=sc.nextLine();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
			

	}

}
 
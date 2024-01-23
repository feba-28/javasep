package practiceqn221123;
import java.util.Scanner;
public class Vowelcheck {

	public static void main(String[] args) {
		System.out.println("Enter character");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println(c+" is vowel");
		}
		else
		{
			System.out.println(c+" is constonant");
		}

	}

}

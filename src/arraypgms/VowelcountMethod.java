package arraypgms;
import java.util.Scanner;
public class VowelcountMethod {

	public static void main(String[] args) {
		
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		VowelcountMethod v=new VowelcountMethod();
		int count=v.vowelCount(s);
		System.out.println("count="+count);
	}

	public int vowelCount(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
			{
				c++;
			}
		}
		return c;
	}
}

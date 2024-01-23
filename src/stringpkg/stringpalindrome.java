package stringpkg;
import java.util.Scanner;
import oopspkg.Accessmodifier;
public class stringpalindrome extends Accessmodifier {
	
	
	public static void main(String[] args) {
		
		Accessmodifier ob=new Accessmodifier();
		stringpalindrome sb=new stringpalindrome();
		sb.c=8;
		Scanner sc =new Scanner(System.in);
		String rev="";
		
		System.out.println("ENter String");
		String str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
			System.out.println("is palindrome");
		else
			System.out.println("is not palindrome");


	}

}

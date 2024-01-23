package controlstatements;
import java.util.Scanner;
public class scannerchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println("enter a charachter");
		char c=sc.next().charAt(1);
		System.out.println(c);
		
		
		

	}

}
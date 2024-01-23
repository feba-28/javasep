package arraypgms;
import java.util.Scanner;
public class stringarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ar[]= new String[5];
		System.out.println("Enter names");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
			}
				
		

	}

}

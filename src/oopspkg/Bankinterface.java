package oopspkg;
import java.util.Scanner;

interface Bank
{
	void accoundetails(String name);
	void balance();
	void withdraw();
	void deposit();
	
}
class Bankdetails implements Bank
{
	static String Bankname="Federal";
	int balanceamt=50000; 
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void balance() {
		System.out.println(balanceamt);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter amount to withdraw");
		int w=sc.nextInt();
		balanceamt-=w;
		System.out.println("Final balance");
		balance();	
	}

	@Override
	public void deposit() {
		System.out.println("Enter amount to deposit");
		int d=sc.nextInt();
		balanceamt+=d;
		System.out.println("Final balance");
		balance();
	}

	@Override
	public void accoundetails(String name) {
	
		System.out.println("Enter account number");
		int accno=sc.nextInt();
		System.out.println("Name:"+name+" "+"Account number:"+accno+" "+"Bankname="+Bankname);
		
	}
}
public class Bankinterface {
	
	public static void main(String[] args) {
		
		Bankdetails b=new Bankdetails();
		
		b.accoundetails("Anand");
		b.balance();
		b.withdraw();
		b.deposit();
			
	}
}

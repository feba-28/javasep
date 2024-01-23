package practiceqn241123;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		

		int i,count=0;      
		Scanner sc=new Scanner(System.in);
		  int n; 
		  System.out.println("Enter  number");   
		  n=sc.nextInt();
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=n/2;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     count=1;      
		     break;      
		    }      
		   }      
		   if(count==0)  { System.out.println(n+" is prime number"); }  
		  }

	}

}

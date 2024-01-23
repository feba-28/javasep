package oopspkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Compiletime exception
		FileInputStream ip=new FileInputStream("E://Book1.xlsx");
		
		
		
		
	//runtime exception	
		try {
			int c=5/0;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
		
		/*String s=null;
		System.out.println(s.length()); */
		 try
		 {
			 String s=null;
				System.out.println(s.length());
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println("Exception details");
		 }

	}

}

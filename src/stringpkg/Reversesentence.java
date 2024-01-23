package stringpkg;

public class Reversesentence {

	public static void main(String[] args) {
		  String str = "Testing Training centre";
		  String[] s=str.split(" ");
		  String ans = ""; 
		  System.out.println("String length: " + s.length);
		   
		 for (String a : s)
	          System.out.println(a);
		  
		 for (int i = s.length - 1; i >= 0; i--)
	      { 
	        ans += s[i] + " "; 
	      } 
	/*	  
	     String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--)
	      { 
	        ans += s[i] + " "; 
	      } 
	      */
	   
	      System.out.println("Reversed String: " + ans);

}
}

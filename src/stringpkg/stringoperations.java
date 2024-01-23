package stringpkg;

public class stringoperations {

	public static void main(String[] args) {
		
		//concat
		String s="hello";
		String s1="welcome";
		String s2="Hello welcome";
		String s3="Welcome";
		String s4="   hi   ";
		System.out.println(s+s1);
		System.out.println(2+5+s+5+6);
		
		//equals
		System.out.println(s3.equals(s1));
		System.out.println(s1.equalsIgnoreCase(s3)); //checks if contents are same only, ignores the case
		
		//contains
		System.out.println(s2.contains("welcome"));
		
		//touppercas and tolowercase
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//length
		System.out.println(s2.length());
		
		//starts with and ends with
		System.out.println(s2.startsWith("hello"));
		System.out.println(s2.endsWith("welcome"));
		
		//trim
		System.out.println(s3.trim());
		
		//replace
		System.out.println(s2.replace("Hello", "HI"));
		
		//substring
		System.out.println(s2.substring(2));
		System.out.println(s.substring(1,3));
		System.out.println(s2.substring(1,4));
		
		//split
		String s5="hello welcome to luminr technolab";
		String[] st=s5.split(" ");
		for(String e:st)
		{
			System.out.println(e);
		}
		
		//tochararray
		String s6="hello";
		char[] c = s6.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
		//to find element at a postition
		System.out.println(s.charAt(2));
	}

}

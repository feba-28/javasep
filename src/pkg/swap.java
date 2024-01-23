package pkg;

public class swap {

	public static void main(String[] args) {
		
		int a=25, b=40,c;
		System.out.println("Before swapping: a="+a+ " b="+b);
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping: a="+a+ " b="+b);
		
		System.out.println("Without using Temproray variable");
		a=25;
		b=40;
		System.out.println("Before swapping: a="+a+ " b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: a="+a+ " b="+b);
		
	}

}

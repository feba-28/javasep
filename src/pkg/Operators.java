package pkg;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators(+,-,*,/,%)
		
		int a=20, b=10;
		System.out.println("a+b="+(a+b)); 
		System.out.println("a+b="+(a-b));
		System.out.println("a+b="+(a*b));
		System.out.println("a+b="+(a/b)); //quotient value
		System.out.println("a+b="+(a%b)); //remainder value
		
		// Assignment Operators (=,+=,-=)
		
		int c=a;
		System.out.println(a+=b); //a=a+b a=20+10=30; a=30
		System.out.println(a-=b); //a=a-b a=30-10=20 a=20
		System.out.println(a*=b);
		System.out.println(a/=b);
		System.out.println(a%=b);
		//Relational Operators (<,>,<=,>=,!=,==)
		
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
	
		//Logical Operators(&&,||,!)
		
String username="abc";
String password="abc123";
System.out.println(username=="abc" && password=="abc123");
System.out.println(username=="abc" || password=="abc124");
System.out.println(!(username=="abc"));	

//unary operators

int c1=10, c2=20;
//c1++ postincrement
//++c1 preincrement

System.out.println(c1++);
System.out.println(++c1);
System.out.println(c1--);	
System.out.println(--c1);	

	//Ternary Operators
	
	String v= c1>c2?"c1 is greater":"c2 is greater";
	System.out.println(v);
}
}

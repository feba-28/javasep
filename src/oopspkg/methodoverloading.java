package oopspkg;

public class methodoverloading {

	public static void main(String[] args) {
		methodoverloading ob=new methodoverloading();
		ob.add();
		ob.add(20,10);
		ob.add(2.3,2);
		ob.add(3,4.5);// TODO Auto-generated method stub

	}
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
		
	}
	
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
		
	}

}

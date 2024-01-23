package arraypgms;
import java.util.Scanner;
public class Areausingmethod {

	public static void main(String[] args) {
		
		Areausingmethod ob=new Areausingmethod();
		Scanner sc=new Scanner(System.in);
		ob.square();
		int areaRec=ob.rectangle();
		System.out.println("Area of rectangle"+areaRec);
		System.out.println("Enter base and height of triangle");
		int b=sc.nextInt();
		int h=sc.nextInt();
		ob.triangle(b,h);
		System.out.println("Enter radius of circle");
		int r=sc.nextInt();
		double areaCir=ob.circle(r);
		
	}
	public void square()
	{
		int side=20;
		int area=side*side;
		System.out.println("Area of Square="+area);
	}
	public int rectangle()
	{
		int l=30,b=15,area;
		area=l*b;
		return area;
	}
	public void triangle(int b, int h)
	{
		double area=0.5*b*h;
		System.out.println("Area of Triangle="+area);
	}
	public double circle(int r)
	{
		double area=3.14*r*r;
		return area;
	}
	
	

}

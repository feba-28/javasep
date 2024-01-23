package oopspkg;

class Parent
{
	public void display()
	{
		System.out.println("display method");
	}
}

class Child extends Parent
{
	public void childmtd()
	{
		System.out.println("child details");
	}
}
public class Singlelevelinheritence {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.childmtd();
		

	}

}

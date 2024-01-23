package oopspkg;

class Animal1
{
	public void anmlmtd()
	{
		System.out.println("Animal detais");
	}
}

class Tiger extends Animal1
{
	public void tigerdtl()
	{
		System.out.println("tiger detais");
	}
}

class Deer extends Animal1
{
	public void deerdtl()
	{
		System.out.println("Deer detais");
	}
}
public class Heirarchical {

	public static void main(String[] args) {
		
		Tiger t=new Tiger();
		t.anmlmtd();
		t.tigerdtl();
		Deer d=new Deer();
		d.anmlmtd();
		d.deerdtl();

	}

}

package oopspkg;

class Parent1
{
	public void job()
	{
		System.out.println("Engineer");
	}
}
class Child1 extends Parent1
{

	@Override
	public void job() {
		System.out.println("Doctor");
		super.job();
	}
	
	
}

public class Methodoverriding {

	public static void main(String[] args) {
		
		Child1 ob = new Child1();
		ob.job();

	}

}

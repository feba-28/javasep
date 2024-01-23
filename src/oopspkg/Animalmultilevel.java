package oopspkg;

class Animal
{
	public void animalmethod()
	{
		System.out.println("animal details");
	}
}

class Dog extends Animal
{
	public void dogmethod()
	{
		System.out.println("dog details");
	}	
}
class Babydog extends Dog
{
	public void babydogmethod()
	{
		System.out.println("babydog details");
	}	
}

public class Animalmultilevel {

	public static void main(String[] args) {
		Babydog b=new Babydog();
		b.animalmethod();
		b.dogmethod();
		b.babydogmethod();
		

	}

}

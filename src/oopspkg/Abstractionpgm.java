package oopspkg;



abstract class Car 
{
	abstract public void acceleration();
	abstract public void speedlimit();
	public void carengine()
	{
		System.out.println("carengine");
	}
}

class Kia extends Car
{

	@Override
	public void acceleration() {
		
		System.out.println("kia acceleration");
		
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		
	}
}
class Maruti extends Car
{

	@Override
	public void acceleration() {
		System.out.println("maruti acceleration");
		
	}

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstractionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kia ob=new Kia();
		ob.acceleration();
		ob.carengine();
		Maruti m=new Maruti();
		m.acceleration();
		m.carengine();

	}

}

package oopspkg;

interface Cardetails
{
	public void acceleration();
	void speedlimit();
}

class Ford implements Cardetails
{

	@Override
	public void acceleration() {
		System.out.println("Ford acceleration");
		
	}

	@Override
	public void speedlimit() {
		
		System.out.println("Ford speed limit");
	}
	
}
class Maruti1 implements Cardetails
{

	@Override
	public void acceleration() {
		
		System.out.println("Maruti acceleration");
	}

	@Override
	public void speedlimit() {
		System.out.println("Maruti speed limit");
		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		
		/*Ford ob=new Ford();  */ Cardetails ob=new Ford();
		ob.acceleration();
		ob.speedlimit();
ob= new Maruti1();
	}

}

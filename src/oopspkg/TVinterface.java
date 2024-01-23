package oopspkg;


interface Tvremote
{
	void volume();
	void channel();
}
interface smartTvremote extends Tvremote
{
	void wifi();

}
class TV implements smartTvremote
{

	@Override
	public void volume() {
		System.out.println("volume up/down");
		
	}

	@Override
	public void channel() {
		System.out.println("channel up/down");
		
	}

	@Override
	public void wifi() {
		System.out.println("set wifi");
		
	}
	
}
public class TVinterface {

	public static void main(String[] args) {
		
		TV ob=new TV();
		ob.channel();
		ob.volume();
		ob.wifi();

	}

}

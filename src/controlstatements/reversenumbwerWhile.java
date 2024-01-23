package controlstatements;

public class reversenumbwerWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=567;
		int r,rev=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
System.out.println("reverse of 567="+rev);
	}

}

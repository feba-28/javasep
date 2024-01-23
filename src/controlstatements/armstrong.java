package controlstatements;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
			int temp=n;
		int r,a=0;
		while(n!=0)
		{
			r=n%10;
			
			a=a+r*r*r;
			n=n/10;
		}
		if(temp==a)
		{
System.out.println(temp+" is armstrong");

		}
		else
			System.out.println(temp+" is not armstrong");	

	}

}

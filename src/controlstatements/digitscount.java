package controlstatements;

public class digitscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=567;
		int i=0;
		while(n!=0)
		{
			//r=n%10;
			//rev=rev*10+r;
			i++;
			n=n/10;
		}
System.out.println("count of digits of 567="+i);

	}

}

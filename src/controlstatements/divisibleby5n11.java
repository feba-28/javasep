package controlstatements;

public class divisibleby5n11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		if(a%5==0)
		{
			if(a%11==0)
			{
				System.out.println(a+" is divisible by 5 and 11");
			}
			else
			{
				System.out.println(a+" is divisible by 5 not by 11");
			}
		}
		else
		{
			System.out.println(a+" is  not divisible by 5 and 11");
		}
	}

}

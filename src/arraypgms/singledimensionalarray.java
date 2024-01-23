package arraypgms;

import java.util.Scanner;

public class singledimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[3];
		//	ar[0]=23;
			//ar[1]=43;
			//ar[2]=65;
			System.out.println("Enter numbers");
			Scanner sc= new Scanner(System.in);
			
			
			for(int j=0;j<3;j++)
			{
				ar[j]=sc.nextInt();
			}
			for(int i=0;i<3;i++)
			{
				System.out.println(ar[i]);
				}

	}

}

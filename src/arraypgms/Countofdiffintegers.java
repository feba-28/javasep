package arraypgms;
import java.util.Scanner;
public class Countofdiffintegers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int pc=0,nc=0,zc=0;
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			
			if(ar[i]<0)
			{
				nc++;
			}
			else if(ar[i]>0)
			{
				pc++;
			}
			else
			{
				zc++;
			}
		}
			
		System.out.println("Positive count="+pc);
		System.out.println("Negative count="+nc);
		System.out.println("Zero count="+zc);
		}

	}



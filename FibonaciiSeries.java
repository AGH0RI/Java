package loops;
import java.util.Scanner;
public class FibonaciiSeries {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter No. Of Terms To Print : ");
		int n=sc.nextInt(),a=0,b=1;
		System.out.print(a+" "+b+" ");
			for(int i=0;i<n-2;i++)
			{
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
	}
}

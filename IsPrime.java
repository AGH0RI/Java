package loops;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number To Check : ");
		int n=sc.nextInt(),c=1;
		for(int i=2;i*i<=n;i++)
		{	
			if(n%i==0)
			{
				c=0;
				break;
			}
		}
		if(n<2)
			c=0;
		if(c==0)
			System.out.println("Number "+n+" Is Not A Prime Number");
		else
			System.out.println("Number "+n+" Is A Prime Number");
	}

}

package loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		int n=sc.nextInt();
		System.out.print("Enter Power For The Number : ");
		int power=sc.nextInt();
		int ans=1;
		for(int i=0;i<power;i++)
			ans=ans*n;
		System.out.println("Your Answer Is : "+ans);
	
	}

}

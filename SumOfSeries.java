package loops;
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number Of Terms Upto Which Sum Is Needed : ");
		int n = sc.nextInt();
		double sum=0.0;
		
		for(double i=1.0 ;i<=n;i++)
			sum+=1/i;
		System.out.println("The Sum of Series Upto "+n+" Terms Is "+sum);
		
	}

}

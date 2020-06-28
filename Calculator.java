package conditionalStatements;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The First Number : ");
		int a = sc.nextInt();
	
		System.out.println("Enter The Second Number : ");
		int b = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter The Operation ");
		char operation=sc.nextLine().charAt(0);
		
		int result =0;
		switch(operation)
		{
		case '+':
			result =a+b;
			break;
		case '-':
			result =a-b;
			break;
		case '/':
			result = a/b;
			break;
		case '*':
			result = a*b;
			break;
		default:
			System.out.println("Not Understandable Operator Is Used");
		}
		System.out.println("The Result Is "+result);

	}

}

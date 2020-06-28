package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		int daysOfWeek=5;
		
		switch(daysOfWeek)
		{
		case 1:
			System.out.println("I Am On Leave");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("I Am In Office");
			break;
		case 6:
			System.out.println("I Am Playing Football");
			break;
		case 7:
			System.out.println("I Am Watching Movie");
			break;
		default:
			System.out.println("I Don't Know What Day Is");
			break;
		}
	}

}

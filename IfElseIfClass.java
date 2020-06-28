package conditionalStatements;

public class IfElseIfClass {

	public static void main(String[] args) {
		int number = 23;
		
		if(number<=10)
			System.out.println("Number Is Less Than 10");
		else if(number >10  && number <=20)
			System.out.println("The Number is In Between 10 And 20");
		else if(number >20  && number <=30)
			System.out.println("The Number is In Between 20 And 30");
		else
			System.out.println("Number Is Greater Than 30");

	}

}

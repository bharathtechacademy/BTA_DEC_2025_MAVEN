package conditionalStatements;

public class SwitchCaseConditionalStatement {

	// switch-case statement ==> when we know the result of condition and we want to
	// choose one among many options

	// syntax:
	// switch(variable/expression) { case value1: //code break; case value2: //code
	// break; ... default: //code }

	public static void main(String[] args) {

		String day = "FunDay";

		switch (day) {

		case "Monday":
			System.out.println("Regular School Uniform");
			break;
		case "Tuesday":
			System.out.println("Regular School Uniform");
			break;
		case "Wednesday":
			System.out.println("Regular School Uniform");
			break;
		case "Thursday":
			System.out.println("Regular School Uniform");
			break;
		case "Friday":
			System.out.println("Casual Dress");
			break;
		case "Saturday":
			System.out.println("Sports Dress");
			break;
		case "Sunday":
			System.out.println("Holiday - No School");
			break;
		default:
			System.out.println("Invalid Day");
		}

	}

}

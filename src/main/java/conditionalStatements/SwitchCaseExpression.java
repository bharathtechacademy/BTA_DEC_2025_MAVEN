package conditionalStatements;

public class SwitchCaseExpression {

	public static void main(String[] args) {

		String day = "Sunday";
		String output = "";

		switch (day) {

		case "Monday":			
		case "Tuesday":		
		case "Wednesday":			
		case "Thursday":		
		case "Friday":
			System.out.println("Weekday");
			output ="WeekDay";
			break;
		case "Saturday":			
		case "Sunday":
			System.out.println("Weekend");
			output ="Weekend";
			break;
		default:
			System.out.println("Invalid Day");
			output ="Invalid Day";
		}
		
		System.out.println("The output is: " + output);
		
		// Using switch expression to achieve the same result
		String result = switch (day) {
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
		case "Saturday", "Sunday" -> "Weekend";
		default -> "Invalid Day";
		};
		
		System.out.println("The result is: " + result);

	}

}

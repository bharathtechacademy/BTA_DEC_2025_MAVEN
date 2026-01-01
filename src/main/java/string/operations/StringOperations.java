package string.operations;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringOperations {

	public static void main(String[] args) {
		
		// Store String in a variable
		String value = " Username : Admin | Password : admin123 ";
		System.out.println("Original String: " + value);
		
		//Total number of characters available within the string.  ==> String.length()
		int length = value.length();
		System.out.println("Length of the String: " + length);
		
		//Get the specific character from a specific index within the string.  ==> String.charAt(index)
		char charAtIndex5 = value.charAt(5);
		System.out.println("Character at index 5: " + charAtIndex5);
		
		//Reverse the string by using the above two methods.
		String reversedString ="";
				
		for(int i=length-1; i>=0 ; i--) {
			reversedString=reversedString+value.charAt(i);
		}
		System.out.println("Reversed String: " + reversedString);
		
		//Remove the unwanted spaces (beginning and trailing spaces) from the string.  ==> String.trim()
		String trimmedString = value.trim();
		System.out.println("Original String: '" + value + "'");
		System.out.println("Trimmed String: '" + trimmedString + "'");
		
		//Remove all the spaces from the string (including the spaces added in the middle of the characters.) ==> String.replace(" ","");
		String stringWithoutSpaces = value.replace(" ", "");
		System.out.println("String without spaces: '" + stringWithoutSpaces + "'");
		
		//Remove all the alphabets from the string. ==> String.replaceAll("[a-zA-Z]", "");
		String stringWithoutAlphabets = value.replaceAll("[a-zA-Z]", "");
		System.out.println("String without alphabets: '" + stringWithoutAlphabets + "'");
		
		//Remove all the numbers from the string. ==> String.replaceAll("[0-9]", "");
		String stringWithoutNumbers = value.replaceAll("[0-9]", "");
		System.out.println("String without numbers: '" + stringWithoutNumbers + "'");
		
		//Remove all the special characters from the string. ==> String.replaceAll("[^a-zA-Z0-9 ]", "");
		String stringWithoutSpecialChars = value.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("String without special characters: '" + stringWithoutSpecialChars + "'");
		
		//Convert the entire string to uppercase. ==> String.toUpperCase()
		String upperCaseString = value.toUpperCase();
		System.out.println("Uppercase String: '" + upperCaseString + "'");
		
		//Convert the entire string to lowercase. ==> String.toLowerCase()
		String lowerCaseString = value.toLowerCase();
		System.out.println("Lowercase String: '" + lowerCaseString + "'");
		
		//Extract the username and password from the string. ==> String.substring(beginIndex, endIndex+1)
		String username = value.substring(12, 17);
		String password = value.substring(31);
		System.out.println("Extracted Username: '" + username + "'");
		System.out.println("Extracted Password: '" + password + "'");

		//Extract the username and password from the dynamic string. ==> String.split(expression)
		String[] parts = value.split(" ");
		String dynamicUsername = parts[3];
		String dynamicPassword = parts[7];
		System.out.println("Dynamically Extracted Username: '" + dynamicUsername + "'");
		System.out.println("Dynamically Extracted Password: '" + dynamicPassword + "'");
		
		//Compare two different strings.
		//equals() ==> case-sensitive comparison
		//equalsIgnoreCase() ==> case-insensitive comparison
		//contains() ==> checks if one string contains another string
		//startsWith() ==> checks if the string starts with a specific prefix
		//endsWith() ==> checks if the string ends with a specific suffix
		
		String name = "Argha Koner";
		System.out.println("Is name equal to 'Argha Koner'? " + name.equals("Argha Koner"));
		System.out.println("Is name equal to 'Argha koner'? " + name.equals("Argha koner"));
		System.out.println("Is name equal to 'Argha koner' (ignore case)? " + name.equalsIgnoreCase("Argha koner"));
		System.out.println("Does name contain 'Koner'? " + name.contains("Koner"));
		System.out.println("Does name contain 'koner'? " + name.contains("koner"));
		System.out.println("Does name start with 'Argha'? " + name.startsWith("Argha"));
		System.out.println("Does name end with 'Koner'? " + name.endsWith("Koner"));
		
		//Verify whether the string is empty (not even spaces) or blank (only spaces). ==> String.isEmpty() and String.isBlank()
		String emptyString = "";
		String blankString = "   ";
		System.out.println("Is emptyString empty? " + emptyString.isEmpty());
		System.out.println("Is blankString empty? " + blankString.isEmpty());
		System.out.println("Is emptyString blank? " + emptyString.isBlank());
		System.out.println("Is blankString blank? " + blankString.isBlank());
		
		//String vs StringBuffer vs StringBuilder
		
		//String is immutable.
		//StringBuffer is mutable and thread-safe (synchronized).
		//StringBuilder is mutable but not thread-safe (not synchronized).
		
		
		//Example of String immutability
		String fullName = "Argha";
		fullName.concat(" Koner");
		System.out.println(fullName); //Argha 
		
		//Example of StringBuffer mutability
		StringBuffer fullNameBuffer = new StringBuffer("Argha");
		fullNameBuffer.append(" Koner");
		System.out.println(fullNameBuffer); //Argha Koner
		
		//Example of StringBuilder mutability
		StringBuilder fullNameBuilder = new StringBuilder("Argha");
		fullNameBuilder.append(" Koner");
		System.out.println(fullNameBuilder); //Argha Koner
		
		// Converting other data types into string. ==> String.valueOf(data)
		int stdCode = 144;
		int phone = 324326;
		String std = String.valueOf(stdCode);
		System.out.println(std+phone);
		
		// Converting string to other data types. ==> Integer.parseInt(string), Double.parseDouble(string), etc.
		String balance = " Account balance is : 99999.99$ ";
		balance=balance.replaceAll("[^0-9.]", "");
		double bal = Double.parseDouble(balance);
		boolean isMin10KBalance = bal >= 10000.0;
		System.out.println("Is minimum 10K balance available? " + isMin10KBalance);
		
		//Converting date and time into string.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");//dd stands for day, MM for month, yyyy for year, HH for hour, mm for minute, ss for second
		String dateTimeString = sdf.format(Calendar.getInstance().getTime());
		System.out.println("Current date and time as String: " + dateTimeString);
		
		// Type Conversion vs Type Casting
		// Type Conversion: Converting one data type to another data type (e.g., int to String, String to double).
		// Type Casting: Converting one primitive data type to another primitive data type (e.g., int to double, double to int).
	
		
		//Auto casting or widening casting or implicit casting
		byte marks = 100;
		int studentMarks = marks; //byte to int
		
		//Explicit casting or narrowing casting or manual casting
		int population = 13;
		byte cityPopulation = (byte) population; //int to byte
	}

}

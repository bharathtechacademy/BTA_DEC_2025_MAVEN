package classesAndVariables;

public class RulesOfVariables {

	public static void main(String[] args) {
		
		//Syntax to Store Data : DataType variable = Data;
		
		/*********RULES OF VARIABLES / IDENTIFIERS *********/
		
		String name = "Bharath Reddy"; //valid variable name
		
		//1. The variable or identifier should not be the same as a Java reserved keyword.
		//String long = "Bharath Reddy";
		
		//2. The variable or identifier should not be the same as a Java literal. (true, false, null)
		//String true = "Bharath Reddy";
		
		//3. The variable or identifier should not contain whitespace.
		//String my name = "Bharath Reddy";
		
		//4. The variable or identifier should not start with a number.
		//String 1name = "Bharath Reddy"; 
		
		//5. The variable or identifier should not contain special characters other than underscore and dollar sign.
		//String my@name = "Bharath Reddy";
		
		//6. The variable or identifier should be unique always.
		//String name = "Sarath Reddy";
		
		//7. The variable or identifier names are case sensitive.
		String namE = "Sarath Reddy";
		
		
		
		/*********STANDARDS OF VARIABLES / IDENTIFIERS *********/
		
		//1. Variables should start with a lower case letter followed by camel casing when we are creating a variable, method, or package.
		
		//2. Class names should start with an upper case letter followed by camel casing.
		
		//3. `Constants` should be in all upper case letters with words separated by underscores.
		double PI_VALUE = 3.14;
		
		//4. The variable or identifier should be meaningful, with at least three characters.
		int carNumber = 3355;
		
		
		
		

	}

}

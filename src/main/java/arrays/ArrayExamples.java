package arrays;

public class ArrayExamples {

	// Array : collection of similar data types

	public static void main(String[] args) {

		/****** Creating an array when we know the values ******/
		
		// Store 3 employee names in an array
		String[] empNames = { "John", "Jane", "Doe" };

		// Store 3 employee ids in an array
		int[] empIds = { 101, 102, 103 };

		/****** Creating an array when we don't know the values ******/

		// Store 3 employee names in an array
		String[] empNames2 = new String[3];
		empNames2[0] = "Alice";
		empNames2[1] = "Bob";
		empNames2[2] = "Charlie";

		// Store 3 employee ids in an array
		int[] empIds2 = new int[3];
		empIds2[0] = 201;
		empIds2[1] = 202;
		empIds2[2] = 203;
		
		System.out.println("Employee Names from empNames array:"+empNames[0]);
		System.out.println("Employee IDs from empIds2 array:"+empIds2[1]);
		
		/****** ArrayIndexOutOfBoundsException ******/
		
		String [] empNames3 = new String[2];
		empNames3[0] = "Tom";
		empNames3[1] = "Jerry";
		//empNames3[2] = "Spike"; // This will throw ArrayIndexOutOfBoundsException

	}

}

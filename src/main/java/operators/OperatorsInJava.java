package operators;

public class OperatorsInJava {
	
	//Syntax to Store data :  DataType variable = Data;
	
	//Operator : Operators are special symbols that perform specific operations in Java
	
	// 5 Major types of Operators in Java :
	
	// 1. Arithmetic Operators : +, -, *, /, % (modulus), ++ (+1-->increment), --(-1 --> decrement) ==> Used to perform mathematical calculations
	// 2. Assignment Operators : =, +=, -=, *=, /=, %= ==> Used to assign values to variables
	// 3. Comparison Operators : ==, !=, >, <, >=, <= ==> Used to compare two values and return a boolean result
	// 4. Logical Operators : && (AND), || (OR), ! (NOT) ==> Used to combine multiple boolean expressions
	// 5. Ternary Operator : ? : ==> Used to evaluate a boolean expression and return one of two values based on the result

	public static void main(String[] args) {
		
	// 1. Arithmetic Operators : +, -, *, /, % (modulus), ++ (+1-->increment), --(-1 --> decrement) ==> Used to perform mathematical calculations
		System.out.println("***************Arithmetic Operators****************");
		int a = 10;
		int b = 5;
		System.out.println("Addition: " + (a + b)); // 15
		System.out.println("Subtraction: " + (a - b)); // 5
		System.out.println("Multiplication: " + (a * b)); // 50
		System.out.println("Division: " + (a / b)); // 2
		System.out.println("Modulus: " + (a % b)); // 0
		
		//++ ==> Increment Operator ==> Increases the value of a variable by 1
		//-- ==> Decrement Operator ==> Decreases the value of a variable by 1
		
		//a++ ==> Post Increment ==> First use the value of 'a' then increase it by 1
		//++a ==> Pre-Increment ==> First increase the value of 'a' by 1 then use it
		System.out.println(a++); //10 (Post Increment-Post execution of this line a=11)
		System.out.println(a);		
		System.out.println(++b); //6 (Pre Increment- Pre execution of this line b=6)
		
		// 2. Assignment Operators : =, +=, -=, *=, /=, %= ==> Used to assign values to variables
		
		int c = 20; // Assignment Operator
		System.out.println("Initial value of c: " + c); //c+=10 ==> c=c+10 ==> 30
		
		c += 10;
		System.out.println("After +=10, value of c: " + c); //30
		
		c -= 5;
		System.out.println("After -=5, value of c: " + c); //25
		
		c *= 2;
		System.out.println("After *=2, value of c: " + c); //50
		
		c /= 5;
		System.out.println("After /=5, value of c: " + c); //10
		
		c %= 3;
		System.out.println("After %=3, value of c: " + c); //1
		
		
		// 3. Comparison Operators : ==, !=, >, <, >=, <= ==> Used to compare two values and return a boolean result
		System.out.println("***************Comparison Operators****************");
		
		int x = 15;
		int y = 20;
		
		System.out.println("is x equal to y ? " + (x == y)); // false
		System.out.println("is x not equal to y ? " + (x != y)); // true
		System.out.println("is x greater than y ? " + (x > y)); // false
		System.out.println("is x less than y ? " + (x < y)); // true
		System.out.println("is x greater than or equal to y ? " + (x >= y)); // false
		System.out.println("is x less than or equal to y ? " + (x <= y)); // true
		
		
		//4. Logical Operators : && (AND), || (OR), ! (NOT) ==> Used to combine multiple boolean expressions
		System.out.println("***************Logical Operators****************");
		
		int i = 25;
		int j = 35;
		int k = 30;
		
		System.out.println("is i less than j AND j less than k ? " + ((i < j) && (j < k))); // true && false ==> false
		System.out.println("is i less than j OR j less than k ? " + ((i < j) || (j < k))); // true || false ==> true
		System.out.println("is NOT (i less than j) ? " + (!(i < j))); // !(true) ==> false
		
		//5. Ternary Operator : ? : ==> Used to evaluate a boolean expression and return one of two values based on the result
		System.out.println("***************Ternary Operator****************");
		double rating = 5.6 ;
		String result = (rating >= 7) ? "Watch the Movie" : "Wait for OTT";
		System.out.println(result);	
		

	}

}

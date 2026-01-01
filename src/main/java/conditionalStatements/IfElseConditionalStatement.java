package conditionalStatements;

public class IfElseConditionalStatement {
	
	// if -else statement  ==> when we don't know the result of condition
	
	//1. only if
	// syntax:if(condition) { //code }
	
	//2. if-else
	// syntax:if(condition) { //code } else { //code }
	
	//3. if-else if-else (unlimited else if)
	// syntax:if(condition) { //code } else if(condition) { //code } else { //code }
	
	//4. nested if-else
	// syntax:if(condition) { if(condition) { //code } else { //code } } else { //code }

	public static void main(String[] args) {
		
		//1. only if
		// syntax:if(condition) { //code }
		
		int age = 67;
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
		}
		
		//2. if-else
		// syntax:if(condition) { //code } else { //code }
		if(age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}
		
		//3. if-else if-else (unlimited else if)
		// syntax:if(condition) { //code } else if(condition) { //code } else { //code }
		
		if(age < 13) {
			System.out.println("You are a child.");
		} else if(age >= 13 && age < 20) {
			System.out.println("You are a teenager.");
		} else if(age >= 20 && age < 60) {
			System.out.println("You are an adult.");
		} else {
			System.out.println("You are a senior citizen.");
		}
		
		//4. nested if-else
		// syntax:if(condition) { if(condition) { //code } else { //code } } else { //code }
		
		double marks = 55.5;
		
		if(marks >=85) {
			System.out.println("Distinction Grade");
			
			if(marks >= 90) {
				System.out.println("Hey Dude, You are eligible for Gold Medal");
			} else {
				System.out.println("You are not eligible for Gold Medal");
			}
			
		} else if(marks >= 60) {
			System.out.println("First Class Grade");
			
			if(marks >= 70) {
				System.out.println("Hey Dude, You are eligible for interview");
								
			} else {
				System.out.println("You are not eligible for attending interview");
			}			
			
		} else if(marks >= 50) {
			System.out.println("Second Class Grade");
		} else {
			System.out.println("Fail");
			
			
		}
	

	}

}

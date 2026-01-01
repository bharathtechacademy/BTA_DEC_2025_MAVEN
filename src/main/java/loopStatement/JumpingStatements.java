package loopStatement;

public class JumpingStatements {
	
	// Jumping Statements : set of keywords used to jump from the current iteration to other iterations.
	
	//There are mainly three different types of jumping statements available in Java:
	//1. break statement : it is going to break the loop and jump to the last iteration.
	//2. continue statement: it will help us to skip the current iteration only and continue with next iteration
	//3. return statement : it will help us to exit from the method. Optionally, you can return the value also.

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if(i>4 && i<7) { //5,6
				//break; // break the loop
				continue; //skip the current iteration
			}
			
			System.out.println(i);
		}

	}

}

package loopStatement;

public class WhileLoop {
	
	//While Loop ==> When we don't know the total number of iterations before itself.
	//Syntax:
	//while(condition) {
		//statements
	//}

	public static void main(String[] args) {
		
		// Refresh the page until the page is getting displayed.
		
		int i=1; //Initialization
		
		while (i>0) {
			
			boolean isPageDisplayed = false;
			
			if(i>=10 || isPageDisplayed) {
				break; //Terminate the loop
			}			
			
			System.out.println("Refresh the page: "+i);
			i++; //Increment/Decrement
		}
		
		

	}

}

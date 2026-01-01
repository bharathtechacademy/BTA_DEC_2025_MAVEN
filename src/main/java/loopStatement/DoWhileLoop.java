package loopStatement;

public class DoWhileLoop {
	
	//Syntax of do-while loop:
	/*
	 do {
	     // code block to be executed
	 } while (condition);
	 */

	public static void main(String[] args) {
		
		int i=0;
		
		//while loop
//		while(i >0) {
//			System.out.println("Refresh the Page");
//			i++;
//		}
		
		//do-while loop
		do {
			System.out.println("Refresh the Page");
			i++;
		} while (i > 0);

	}

}

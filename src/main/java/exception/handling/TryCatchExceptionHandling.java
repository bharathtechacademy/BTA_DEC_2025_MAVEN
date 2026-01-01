package exception.handling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		String[] empNames = new String[3];
		
		try {
			empNames[0] = "Bharath";
			empNames[1] = "ABC";
			empNames[2] = "Bharath";
		//	empNames[3] = "Shanmukh";// This will throw ArrayIndexOutOfBoundsException
		} catch (Exception e) {
	//		empNames[3] = "Shanmukh";// This will throw ArrayIndexOutOfBoundsException
			System.out.println("Array Index is Out of Bounds, Please check the array index");
			System.out.println("Exception Details: " + e.getMessage());
		} finally {
			System.out.println("Execution Completed");
		}
		
		

	}

}

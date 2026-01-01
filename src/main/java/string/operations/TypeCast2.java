package string.operations;

public class TypeCast2 extends TypeCast1 {

	public static void main(String[] args) {
		
		// Upcasting (Using Parent class reference to Child class object)
		TypeCast1 obj1 = new TypeCast2();
		
		// Downcasting (Using Child class reference to Parent class object)
		TypeCast2 obj2 = (TypeCast2) obj1;// ClassCastException at runtime
		
		//Class to take screenshot in Selenium.
		//TakesScreenshot ts = (TakesScreenshot) driver;
		//JavascriptExecutor js = (JavascriptExecutor) driver;

	}

}

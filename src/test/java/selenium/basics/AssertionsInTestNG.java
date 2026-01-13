package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestNG {
	
	// Two types of assertions are available in TestNG:
	
	//1. Hard Assertions ==> If any assertion fails, the test method is aborted immediately, and subsequent lines of code are not executed.
	//2. Soft Assertions ==> If any assertion fails, the test method continues to execute, and all assertions are evaluated at the end of the test method.

	public static void main(String[] args) {

		//Hard Assertion Example
		Assert.assertEquals(10, 10, "Hard Assertion Failed: Values are not equal.");
		Assert.assertNotEquals("Hello2", "Hello", "Hard Assertion Failed: Values should not be equal.");
		Assert.assertTrue(5 > 3, "Hard Assertion Failed: Condition is false.");
		Assert.assertFalse(2 > 3, "Hard Assertion Failed: Condition is true.");
		Assert.assertNotNull(123, "Hard Assertion Failed: Object is null.");
		Assert.assertNull(null, "Hard Assertion Failed: Object is not null.");
		//Assert.fail("Hard Assertion Failed: Explicit failure.");//intentional failure
		
		//Soft Assertion Example
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(5, 10, "Hard Assertion Failed: Values are not equal.");
		softAssert.assertNotEquals("Hello", "Hello", "Hard Assertion Failed: Values should not be equal.");
		softAssert.assertTrue(5 < 3, "Hard Assertion Failed: Condition is false.");
		softAssert.assertFalse(2 > 3, "Hard Assertion Failed: Condition is true.");
		softAssert.assertNotNull(null, "Hard Assertion Failed: Object is null.");
		softAssert.assertNull(123, "Hard Assertion Failed: Object is not null.");
		softAssert.fail("Hard Assertion Failed: Explicit failure.");//intentional failure
		softAssert.assertAll();//This will collate all soft assertion results and mark the test as failed if any soft assertion failed.
		System.out.println("Execution Completed.");
	}

}

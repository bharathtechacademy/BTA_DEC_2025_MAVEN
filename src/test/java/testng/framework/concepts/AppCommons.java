package testng.framework.concepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons {

	@BeforeMethod(dependsOnMethods = "launchBrowserAndApplication",alwaysRun = true)
	@Parameters({"USERNAME","PASSWORD"})
	public void loginIntoApplication(String username, String password) {
		System.out.println("Login process started for user: " + username);
		System.out.println("User logged in successfully with password: " + password);
	}

	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication() {
		System.out.println("User logged out successfully.");
	}

	@AfterMethod(dependsOnMethods = "logoutFromApplication",alwaysRun = true)
	public void closeApplication() {
		System.out.println("Application is closed successfully.");
	}

	@BeforeMethod(dependsOnMethods = "loginIntoApplication",alwaysRun = true)
	public void verifyApplicationHomePage() {
		System.out.println("Application home page is verified successfully.");
	}
	
	
	@Test (priority=1,groups= {"smoke","regression"},retryAnalyzer = RetryTest.class)
	public void testCase1() {
		Assert.fail("Test Case 1 is Failed");
		System.out.println("Executing test case 1...");		
	}
	
	@Test(groups= {"regression"},enabled=true) //,dependsOnMethods = "testCase1"
	public void testCase2() {
		System.out.println("Executing test case 2...");
	}
	
	@Test(dataProvider="loginData",priority=-1,groups= {"sanity"})
	public void testCase3(String username, String password) {
		System.out.println("Executing test case 3 with data: " + username + ", " + password);
		System.out.println("Test case 3 executed successfully.");}
	
	@Test(groups= {"sanity"},invocationCount=1)
	public void testCase4() {
		System.out.println("Executing test case 4...");
	}
	
	@Test(groups= {"sanity"},timeOut=5000)
	public void testCase5() throws InterruptedException {
		System.out.println("Execution started for test case 4...");
		Thread.sleep(10000);
		System.out.println("Execution started for test case 4...");
	}
}

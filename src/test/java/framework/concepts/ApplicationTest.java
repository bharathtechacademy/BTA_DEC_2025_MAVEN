package framework.concepts;

public class ApplicationTest {

	public static void main(String[] args) {
		
		WebCommons web = new WebCommons();
		AppCommons app = new AppCommons();
		
		web.startReporting();
		
		//Test Case 1
		web.launchBrowserAndApplication("Chrome", "http://www.google.com");
		app.loginIntoApplication("admin", "admin123");
		app.verifyApplicationHomePage();
		app.testCase1();
		app.logoutFromApplication();
		web.closeBrowser();
		
		//Test Case 2
		web.launchBrowserAndApplication("Firefox", "http://www.google.com");
		app.loginIntoApplication("user1", "user123");
		app.verifyApplicationHomePage();
		app.testCase2();
		app.logoutFromApplication();
		web.closeBrowser();
		
		//Test Case 3
		web.launchBrowserAndApplication("Edge", "http://www.google.com");
		app.loginIntoApplication("user2", "user234");
		app.verifyApplicationHomePage();
		app.testCase3("Valid Test Data");
		app.logoutFromApplication();
		web.closeBrowser();
		
		//Test Case 3 with different data
		web.launchBrowserAndApplication("Chrome", "http://www.google.com");
		app.loginIntoApplication("user3", "user345");
		app.verifyApplicationHomePage();
		app.testCase3("Invalid Test Data");
		app.logoutFromApplication();
		web.closeBrowser();
		
		
		web.stopReporting();
		
		

	}

}

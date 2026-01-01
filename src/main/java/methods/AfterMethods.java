package methods;

public class AfterMethods {
	

	public static void main(String[] args) {		
		
		CommonMethods cm = new CommonMethods();

		// Test Case 1: Validating the Home Page
		System.out.println("==============Test Case 1: Validating the Home Page==================");
		CommonMethods.launchBrowserAndApplication("chrome");
		cm.loginIntoApplication();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		cm.logoutAndCloseApplication();

		// Test Case 2: Validating the Fund Transfer Page
		System.out.println("==============Test Case 2: Validating the Fund Transfer Page==================");
		CommonMethods.launchBrowserAndApplication("firefox");
		cm.loginIntoApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		cm.logoutAndCloseApplication();

		// Test Case 3: Validating the Login Page with Valid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Valid Credentials==================");
		CommonMethods.launchBrowserAndApplication("firefox");
		cm.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		cm.logoutAndCloseApplication();

		// Test Case 3: Validating the Login Page with Invalid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Invalid Credentials==================");
		CommonMethods.launchBrowserAndApplication("firefox");
		cm.loginIntoApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		cm.logoutAndCloseApplication();

		// Test Case 4: Validating the Account Balance Page and get the balance
		System.out.println("=========Test Case 4: Validating the Account Balance Page and get the balance======");
		CommonMethods.launchBrowserAndApplication("edge");
		cm.loginIntoApplication();		
		System.out.println(cm.getAccountBalance());
		cm.logoutAndCloseApplication();

	}

}

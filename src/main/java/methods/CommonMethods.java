package methods;

public class CommonMethods {
	
	//static method
	static void launchBrowserAndApplication(String browser){
		System.out.println("Launch the "+browser+" browser");
		System.out.println("Enter url 'www.icici.com' and launch application");		
	}	
	
	void loginIntoApplication(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}
	
	void logoutAndCloseApplication(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}
	
	double getAccountBalance(){
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;//local variable
		return balance;
	}
	
	
	
	

}

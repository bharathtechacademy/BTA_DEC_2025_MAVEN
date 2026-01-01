package non.access.modifiers;

public interface InterfaceClass {
	
	//Interface : interface is a special abstract class.
	//The speciality of interface is that it is 100% abstract. Only abstract methods are allowed.
	
	void loginIntoApplication();
	
	abstract void logoutFromApplication();
	
	default void stopSession() {
		System.out.println("this is not applicable");
		closeConnection();
	}
	
	default void stopSession2() {
		System.out.println("this is not applicable");
		closeConnection();
	}
	
	private void closeConnection() {
		System.out.println("private method in interface");
	}
	
	static void terminateBrowser() {
		System.out.println("static method in interface");
	}
	
	static void terminateBrowser2() {
		System.out.println("static method in interface");
	}

}

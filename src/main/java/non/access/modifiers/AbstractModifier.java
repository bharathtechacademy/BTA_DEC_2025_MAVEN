package non.access.modifiers;

public abstract class AbstractModifier {
	
	//Method: a method is a block of code or collection of statements written together to complete a specific task.
	
	void loginIntoApplication(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}
	
	abstract void logoutFromApplication();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

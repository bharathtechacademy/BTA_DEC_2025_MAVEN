package non.access.modifiers;

public class StaticClass1 {
	
	//static data vs non-static data
	static String companyName = "Techie Delight"; //static variable	
	String employeeName = "John Doe"; //non-static variable
	
	//static method vs non-static method
	static void displayCompany() { //static method
		System.out.println("Location Name: Hyderabad");
	}
	
	void displayEmployee() { //non-static method
		System.out.println("Employee ID: 101");
	}
	

	

	public static void main(String[] args) {
		
		System.out.println("Company Name: " + companyName); //accessing static variable directly
		System.out.println("Employee Name: " + new StaticClass1().employeeName); //accessing non-static variable using object
		
		displayCompany(); //accessing static method directly
		new StaticClass1().displayEmployee(); //accessing non-static method using object

	}

}

package classesAndVariables;

public class ClassesInJava {
	
	//Class is a template or prototype that we are going to use to store data and methods together.
	
	
	String empName = "Bharath"; //instance variable (can be accessed by creating object)
	
	int empId = 101;
	
	static boolean visaStatus = true;	//static variable (can be accessed without creating object, by taking class name)
	

	public static void main(String[] args) {		
		
		int age = 30; //local variable (can be accessed only within this method/block)

		ClassesInJava obj = new ClassesInJava(); //object	
		
		System.out.println("Employee Name: " + obj.empName);
		System.out.println("Employee ID: " + obj.empId);
		System.out.println("Visa Status: " + visaStatus);
		System.out.println("Employee Age: " + age);

	}
	
	

}

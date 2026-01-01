package classesAndVariables;

public class NewClass {
	
	//Object ==> new instance of a class (xerox copy of the class)

	public static void main(String[] args) {
		
		ClassesInJava obj = new ClassesInJava(); //object
		
		System.out.println("Employee Name: " + obj.empName);
		System.out.println("Employee ID: " + obj.empId);
		System.out.println("Visa Status: " + ClassesInJava.visaStatus);

	}

}

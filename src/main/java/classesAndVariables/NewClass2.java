package classesAndVariables;

public class NewClass2 extends ClassesInJava{ // child extends parent
	
		
	public static void main(String[] args) {
		
		ClassesInJava obj2 = new NewClass2(); // object of child class
		
		System.out.println("Employee Name: " + obj2.empName); // accessing parent class non-static variable
		System.out.println("Employee ID: " + obj2.empId); // accessing parent class non-static variable
		System.out.println("Visa Status: " + visaStatus); // accessing parent class static variable

	}

}

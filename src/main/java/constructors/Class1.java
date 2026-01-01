package constructors;

public class Class1 {
	
	//Constructor: the default method created by Java without any return type.
	//Constructor will have the same name as the class name.
	
	//Two types of constructors available in Java:
	//1. Default constructor: constructor with no arguments or parameters.
	//2. Parameterized constructor: constructor with arguments or parameters.
	
	
//	int empId = 123;
//	String empName = "Bharath";
	
	//default constructor
	Class1(){
		
	}
	
	int empId;
	
	//parameterized constructor
	Class1(int id){
		empId=id;
	}
	
	// parameterized constructor
	Class1(String empName) {

	}
	
	//Method 1: Print employee details.
	public void printEmpDetails(String empName) {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ empName);		
	}
	
	//Method 2: print the employee address.
	public void printEmpAddress(String address) {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Address: " + address);
	}
	
	//Method 3: print the employee salary.
	public void printEmpSalary(double salary) {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Salary: " + salary);
	}
	
	//Method 4: print the employee phoneNumber.
	public void printEmpPhoneNumber(long phoneNumber) {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Phone Number: " + phoneNumber);
	}


}

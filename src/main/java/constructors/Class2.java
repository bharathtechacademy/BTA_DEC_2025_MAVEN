package constructors;

public class Class2 {

	public static void main(String[] args) {		
		//Create object of class1
		Class1 obj = new Class1(123);//object = new + constructor-method 
		
//		Class1 obj1 = new Class1();
		
//		System.out.println(obj.empId);
//		System.out.println(obj.empName);
		
		//Call the methods using the object created.
//		obj.printEmpDetails(123, "Bharath");
//		obj.printEmpAddress(123, "123, ABC Street, XYZ City");
//		obj.printEmpSalary(123, 75000.50);
//		obj.printEmpPhoneNumber(123, 9876543210L);
		
		obj.printEmpDetails("Bharath");
		obj.printEmpAddress("123, ABC Street, XYZ City");
		obj.printEmpSalary(75000.50);
		obj.printEmpPhoneNumber(9876543210L);
		
	
	}

}

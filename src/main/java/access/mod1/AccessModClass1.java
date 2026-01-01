package access.mod1;

public class AccessModClass1 {
	
	//private data
	public String name ="Bharath";//with in the class only
	
	//public method
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
		System.out.println(name);
	}
	
	//method
	public  int empId() {
		return 101;
	}

	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println("Employee Name: " + obj.name);
		System.out.println("Employee ID: " + obj.empId());
	}

}

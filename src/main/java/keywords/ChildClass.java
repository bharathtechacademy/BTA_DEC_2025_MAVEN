package keywords;

public class ChildClass extends ParentClass{
	
	String name = "JavaScript";
	
	public void printName(String name) {
		System.out.println(name);
//		System.out.println(new ParentClass().name);
//		System.out.println(new ChildClass().name);
		System.out.println(super.name);
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.printName("Python");

	}

}

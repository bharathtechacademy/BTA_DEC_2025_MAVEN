package non.access.modifiers;

public class StaticClass2 {
	
	//static block : A static block is a block of code inside a Java class that is executed when the class is loaded into memory.
	static {
		System.out.println("Static block executed always before main method");
	}

	static int i = 10;
	
	public static void main(String[] args) {
//		StaticClass2 obj = new StaticClass2();
//		System.out.println(obj.i);		
		System.out.println(i);
		
		System.out.println(StaticClass1.companyName); //accessing static variable from another class
	}

}

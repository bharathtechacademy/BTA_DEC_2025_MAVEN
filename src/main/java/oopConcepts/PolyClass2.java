package oopConcepts;

public class PolyClass2 extends PolyClass1 {
	
	
	// Method Overriding (Run time Polymorphism)
	@Override
	public void sum(int a, int b) {
		System.out.println("Sum of integers: " + (a + b));
		
		
		//Example of overloading
		System.out.println(1);
		System.out.println("Bharath");
		System.out.println(true);
	}

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		obj.sum(10, 20);   
	}

}

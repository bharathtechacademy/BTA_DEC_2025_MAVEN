package oopConcepts;

public class PolyClass1 {

	public void sum(int a, int b) {
		System.out.println("The sum of two integers: " + (a + b));
	}

	
	// Method Overloading (Compile time Polymorphism)
	public void sum(int a, int b, int c) {
		System.out.println("The sum of  integers: " + (a + b + c));
	}

	public static void main(String[] args) {

		PolyClass1 obj = new PolyClass1();
		obj.sum(10, 20);
		obj.sum(10, 20, 30);

	}

}

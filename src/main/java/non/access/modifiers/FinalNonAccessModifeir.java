package non.access.modifiers;

//3. final :
// When a user don't want to allow modifications on top of Java elements, we are going to use the final non-access modifier.

//Final data cannot be modified.
//Final method cannot be overridden.
//Final class cannot be inherited.

public  class FinalNonAccessModifeir {
	
	final double pi = 3.14;
	
	public final void printName() {
		System.out.println("Bharath Reddy");
	}
	
	public static void main(String[] args) {
		FinalNonAccessModifeir obj = new FinalNonAccessModifeir();
		// obj.pi=3.15;
		System.out.println("Value of pi: " + obj.pi);
	}

}

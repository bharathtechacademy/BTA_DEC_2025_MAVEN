package non.access.modifiers;

public class OuterClass2 {

	public static void main(String[] args) {
		
		//Accessing non-static inner class data member
		OuterClass1.InnerClass1 innerClass = new OuterClass1().new InnerClass1(); //Creating instance of non-static inner class
		System.out.println(innerClass.value); //Accessing non-static inner class data member

		//Accessing static inner class data member
		OuterClass1.InnerClass2 innerclass2 = new OuterClass1.InnerClass2(); //Creating instance of static inner class
		System.out.println(innerclass2.value); //Accessing static inner class data member
	
	}

}

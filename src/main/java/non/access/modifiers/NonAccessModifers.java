package non.access.modifiers;

public class NonAccessModifers {
	
	//Non Access Modifiers : Non-access modifiers are set of keywords that we are going to use in Java to control the BEHAVIOUR of Java elements.
	
	// There are mainly six non-access modifiers in Java.
	
	// 1. static
	// 2. abstract
	// 3. final
	// 4. synchronized
	// 5. volatile
	// 6. transient
	
	// 1. static :
	// The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes.
	// The static keyword belongs to the class than instance of the class.so, no need to create the object to access the static members.
	
	// 2. abstract :
	// Abstract keyword is used to declare a method without body. Whenever you want to provide high-level information without implementing the method, we are going to use abstract keywords.
	
	
	//3. final :
	// When a user don't want to allow modifications on top of Java elements, we are going to use the final non-access modifier.
	
	//Final data cannot be modified.
	//Final method cannot be overridden.
	//Final class cannot be inherited.
	
	//4. Synchronized :
	// Synchronize non-access modifier can be used before the methods.
	// When we are going to use the synchronized keyword before the method, it is going to allow only one thread at a time.
	
	// 5. volatile: Volatile is the key word we can use before the variable, especially when the variable data is frequently changing.
	// Volatile is going to help us to update the value directly in the main memory itself, instead of updating the value in temporary memory and sending it back to main memory later.
	// So, volatile is mainly used in multi-threading environment.
	
	// 6. transient: Transient is the key word we can use before the variable, especially when we are working with serialization.
	
	//Serialization : Serialization is the process of converting an object into a byte stream.
	//De-serialization : De-serialization is the process of converting a byte stream back into a copy of the object.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

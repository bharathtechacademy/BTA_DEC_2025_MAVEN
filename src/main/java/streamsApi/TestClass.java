package streamsApi;

import java.util.function.BiConsumer;

public class TestClass {

	public static void main(String[] args) {
//		ImpClass obj = new ImpClass();
//		obj.sum(10, 20);
//		obj.multiply(10, 20);
		
//		FunctionalInterfaceClass ref = (a,b) ->  System.out.println("Sum: " + (a + b));
//		ref.sum(10, 20);
		
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("Sum: " + (a + b));		
		biConsumer.accept(10, 20);
		
	}

}

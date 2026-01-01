package exception.handling;

public class ThrowsDeclaration {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Bharath");
		Thread.sleep(2000);  // InterruptedException
		System.out.println("Sarath");
		Thread.sleep(3000);  // InterruptedException
		System.out.println("Surath");
	}

}

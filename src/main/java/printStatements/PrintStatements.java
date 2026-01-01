package printStatements;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Print the information and go to the next line.
		System.out.println("Hello, World!");
		
		//Print the information and stay on the same line.
		System.out.print("Hello, ");
		System.out.print("World!");
		System.out.println();
		
		//Print the dynamic and formatted content and stay on the same line.
		System.out.println("Deepika is completed B.Tech and employee ID is 1234 and visa status is true");
		System.out.println("Prabhu is completed B.Tech and employee ID is 1235 and visa status is false");
		System.out.println("Lakshmi is completed B.Tech and employee ID is 1237 and visa status is false");		
		// %s ==> String 
		// %d ==> digit
		// %b ==> boolean
		// %f ==> float value ==> value with decimals
		System.out.printf("%s is completed B.Tech and employee ID is %d and visa status is %b","Pavithra", 1238, false);
		System.out.println();
		
		double price = 199.49729;
		System.out.printf("Price is : %.3f",price);
		System.out.println();
		
		//Print the error message.
		System.err.println("Hey man, there is an error in line number 31. Please check once.");
		System.out.println();
		
		// Print a multi-line message.
		System.out.println();
		System.out.println("""
				My name is Prabhu.
					My qualification is MCA
					My role is Quality Engineer """);
		System.out.println();
		
		// Print the logs during the execution process to monitor and understand the outcome of each and every line and each and every stage.
		Logger log = Logger.getLogger("Hello World");
		log.info("Hey man, currently we have completed line number 46 successfully. Congratulations!");
		System.out.println();
		log.warning("Hey man, we have completed line number 48, but unfortunately, there is some issue. Please check.");
		
		// Print and export the log messages into a text file.
		PrintWriter logger = new PrintWriter("C:\\Training\\Dec_2025_930PM\\AutomationTraining\\JavaTraining\\Logs.txt");
		logger.println("Hello user. Currently line number 54 is successfully completed.");
		logger.println("Hello user. Currently line number 55 is successfully completed.");
		logger.close();


	}

}

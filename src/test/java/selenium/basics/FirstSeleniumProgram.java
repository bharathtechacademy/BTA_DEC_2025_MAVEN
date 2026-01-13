package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Launch the application.
		driver.get("https://www.google.com");
		
		// Close browser.
		driver.quit();

	}

}

package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicLocators {
	
	//	1. ID Locator : id attribute value of the web element
	//	2. Name Locator : name attribute value of the web element
	//	3. Class Name Locator : class attribute value of the web element
	//	4. Tag Name Locator : html tag name of the web element
	//	5. Link Text Locator: text value of hyperlink web element
	//	6. Partial Link Text Locator: partial text value of hyperlink web element

	public static void main(String[] args) {
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
	
//		2. Maximize the browser window   		
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   		
		driver.get("https://www.google.co.in/");
		
//		5. Locate the Google search text box by using 'id' locator.
		driver.findElement(By.id("APjFqb"));
		
//		6. Locate the Google search text box by using 'name' locator.
		driver.findElement(By.name("q"));
		
//		7. Locate the Google search text box by using 'className' locator.
		driver.findElement(By.className("gLFyf"));
		
//		8. Locate the Google search text box by using 'tagName' locator.
		driver.findElement(By.tagName("textarea"));
		
//		9. Locate the "How Search Works" hyperlink by using 'linkText' Locator.
		driver.findElement(By.linkText(" How Search works "));
		
//		10. Locate the "How Search Works" hyperlink by using 'partialLinkText' Locator.
		driver.findElement(By.partialLinkText("How Search"));

	}

}

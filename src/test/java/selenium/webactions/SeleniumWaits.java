package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWaits {
	
	// Types of waits in Selenium
	
	// 1. Implicit Wait ==> applies to all the web elements in the web page
	// 2. Explicit Wait ==> applies to a specific web element ==> 10 sec ==> every 0.5 sec it will check for the element
	// 3. Fluent Wait ==> applies to a specific web element with polling time 
	public static void main(String[] args) {
		
//		1. Launch the Chrome browser window
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window		
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL "https://parabank.parasoft.com/parabank" and Launch the application
		driver.get("https://parabank.parasoft.com/parabank");
		
//		5. Verify application title
		String expectedTitle = "ParaBank | Welcome | Online Banking";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Application title does not match");
		
//		6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		
		// Using Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Using Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(logo));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));
		wait.until(ExpectedConditions.invisibilityOf(logo));
		
		// Using Fluent Wait
		Wait<WebDriver> fluentWait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		fluentWait.until(ExpectedConditions.visibilityOf(logo));
		fluentWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));
		fluentWait.until(ExpectedConditions.invisibilityOf(logo));

	}

}

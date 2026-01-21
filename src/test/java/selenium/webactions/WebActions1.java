package selenium.webactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebActions1 {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
//		1. Launch the Chrome browser window
		driver = new ChromeDriver();
		
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
		Assert.assertTrue(logo.isDisplayed(), "Application logo is not displayed");
		
//		7. Verify application caption "Experience the difference"
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String expectedCaption = "Experience the difference";
		String actualCaption = caption.getText();
		Assert.assertEquals(actualCaption, expectedCaption, "Application caption does not match");
		
//		8. Enter Invalid credentials in Username (Invalid User) and Password (Empty) textboxes
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("Invalid User");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		
//		9. Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		10. Verify error message is displayed (The username and password could not be verified.)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[text()='Please enter a username and password.']"), 0));
		
		WebElement errorMessage = driver.findElement(By.xpath("//p[text()='Please enter a username and password.']"));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed");
		
//		11. Click on Adminpage link
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();
		
//		12. Wait for admin page		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
//		13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		
//		14. Scrolldown till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loanProvider);
		
//		15. Select Loanprovider as 'Web Service'
		Select s = new Select(loanProvider);
		s.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		
//		18.Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		
//		19.Wait for Services page		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services
		WebElement bookstoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);", bookstoreServices);
		
//		21.Get total rows, columns in the bookstore service table		
		////span[text()='Bookstore services:']/following-sibling::table[1]//tr  ==> 8 rows
		////span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td  ==> 3 columns
		
		////span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td[1] ==>row 1 column 1
		////span[text()='Bookstore services:']/following-sibling::table[1]//tr[2]//td[1] ==>row 2 column 1	
		
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td"));
		int totalRows = rows.size();
		int totalColumns = columns.size();
		
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
		for(int r=1; r<=totalRows; r++) {
			for(int c=1; c<=totalColumns; c++) {
				WebElement cellData = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr["+r+"]//td["+c+"]"));
				System.out.println("Row "+r+" Coumn "+c+" , Value is : " + cellData.getText());
			}
		}
		
//		24.Close browser window
		driver.quit();
	}
	
	
	public static void selectDataAccessMode(String mode) {
		WebElement dataAccessMode= driver.findElement(By.xpath("//input[@value='"+mode+"']"));
		dataAccessMode.click();
	}

}

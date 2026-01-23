package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		//1. Launch browser window(Chrome)   
		driver = new ChromeDriver();
		
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies 
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)   
		driver.get("https://demoqa.com/automation-practice-form");
		
		//5. Wait for Page-load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Practice Form']"), 0));
		
		//6. Enter First name and Last name  
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("John");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Doe");
		
		//7. Enter Email     
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("johndoe@gmail.com");
		
		//8. Select Gender (Male)    
		selectGender("Male");
		
		//9. Enter mobile number  
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9876543210");
		
		//10.Select DOB (1-Feb-1991) 		
		selectDOB("1", "February", "1991");		
		
		//11.Search and Select Computer Science   
		selectSubject("Computer Science");
		
		//12.Select Hobbies as Sports and Reading        
		String [] hobbies = {"Sports", "Reading"};
		selectHobbies(hobbies);
		
		//13.Upload photo  
		WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		String filePath = System.getProperty("user.dir") + "\\Files\\Profile.png";
		uploadPhoto.sendKeys(filePath);
		
		//14. Wait till file upload 
		Thread.sleep(2000);		
		
		//15.Submit Details 
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButton);	
		
		//Take the screenshot.
		takeScreenshot(driver, "FileSubmission");
		
		//16. Close browser window
		driver.quit();
	}
	
	//Common method: To select the gender within the form by providing the gender option.
	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='"+option+"']"));
		gender.click();
	}
	
	//Common method to select the date of birth within the form by providing parameters as date, month, year.
	public static void selectDOB(String date, String month, String year) {
		
		//Click on DOB field to open the date picker/calendar
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		
		//Wait until calendar is going to load properly. 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		
		//Select Month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText(month);
		
		//Select Year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText(year);
		
		//Select Date
		WebElement datePicker = driver.findElement(By.xpath("//div[text()='"+date+"' and contains(@aria-label, '"+month+"')]"));
		datePicker.click();
	}
	
	//Common method to select the subjects within the form by providing the subject name.
	public static void selectSubject(String subjectName) {
		
		//Locate the subject input field
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		
		//Enter the subject name. 
		Actions actions = new Actions(driver);
		actions.sendKeys(subjectInput, subjectName).perform();
		
		//Wait until the subject auto-suggestion to appear.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(@class,'option') and text()='"+subjectName+"']"), 0));
		
		//Select the subject from the auto-suggestion list.
		WebElement subjectOption = driver.findElement(By.xpath("//div[contains(@class,'option') and text()='"+subjectName+"']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", subjectOption);
	}
	
	//Common method to select the hobbies within the farm by providing multiple hobbies.
	public static void selectHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			WebElement hobbyOption = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			if (!hobbyOption.isSelected()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", hobbyOption);
			}
		}
	}
	
	//Common method to take the screenshot of entire browser window with parameters as driver and screenshot name.
	public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\MavenProject\\Screenshots\\" + screenshotName + ".png";
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(filePath));
		return filePath;
	}

	// Common method to take the screenshot of webelement with parameters as driver and screenshot name.
	public static String takeScreenshot(WebElement element, String screenshotName) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\MavenProject\\Screenshots\\" + screenshotName + ".png";
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(filePath));
		return filePath;
	}

}

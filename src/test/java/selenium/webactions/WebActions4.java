package selenium.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions4 {

	public static void main(String[] args) {
		//1.Launch Chrome Browser	
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window	
		driver.manage().window().maximize();
		
		//3.Launch the application	(https://demoqa.com/frames)	
		driver.get("https://demoqa.com/frames");
		
		//4.Locate elements 'Frames' header in main window and 'This is a sample page' inside the frame		
		WebElement mainHeader = driver.findElement(By.xpath("//h1[text()='Frames']"));
		
		//Switch to frame 	
		driver.switchTo().frame("frame1"); //Switch using id or name
//		driver.switchTo().frame(0);		//Switch using index
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']"))); //Switch using WebElement
				
		//locate frame element
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
						
		//5.Print frame element text	
		String frameText = frameElement.getText();
		System.out.println("Frame Element Text: " + frameText);
		
		//Switch back to main window
		driver.switchTo().defaultContent();
				
		//6.Print main window element text
		String mainHeaderText = mainHeader.getText();
		System.out.println("Main Window Header Text: " + mainHeaderText);
		
		//7.Close browser window
		driver.quit();
	}

}

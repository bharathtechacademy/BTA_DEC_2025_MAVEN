package selenium.basics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebActions {
	

	public static void main(String[] args) throws MalformedURLException, IOException {		
		
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
	
//		2. Maximize the browser window   		
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   		
		driver.get("https://www.google.co.in/");
		
//		5. Locate the element using XPath locator.
		WebElement element = driver.findElement(By.xpath("//tag[@attribute='attribute-value']"));
		
		/***********************Common Web-Element Actions*************************/
		
//		Verify whether the element is displayed within the web page
		boolean isDisplayed = element.isDisplayed();
		System.out.println("Is Element Displayed: " + isDisplayed);
		
//		Verify whether the element is enabled  within the web page
		boolean isEnabled = element.isEnabled();
		System.out.println("Is Element Enabled: " + isEnabled);
		
//		Verify whether the element is already selected  within the web page
		boolean isSelected = element.isSelected();
		System.out.println("Is Element Selected: " + isSelected);
		
		
		/***********************Web-Element Specific Actions*************************/
		
		/*****************BUTTON ELEMENT ACTIONS*****************/
		
//		Locate the button using XPath locator.
		WebElement button = driver.findElement(By.xpath("//button[@attribute='attribute-value']"));
		
//		Verify the label of the button		
		String buttonLabel = button.getText(); //if the button label added as text value
		System.out.println("Button Label: " + buttonLabel);
		
		String buttonValue = button.getAttribute("value"); //if the button label added as value attribute
		System.out.println("Button Value: " + buttonValue);
		
//		Click on the button
		button.click();
		
//		Double-click on the button
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
//		Right-click on the button
		actions.contextClick(button).perform();
		
// 		mouse hover on the element		
		actions.moveToElement(button).perform();
		
// 		drag the source element and drop on the target element
		WebElement sourceElement = driver.findElement(By.xpath("//tag[@attribute='attribute-value']"));
		WebElement targetElement = driver.findElement(By.xpath("//tag[@attribute='attribute-value']"));
		actions.dragAndDrop(sourceElement, targetElement).perform();
		
//		Scroll to the element and click
		actions.scrollToElement(button).perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		
//		Click on the hidden element using JavaScriptExecutor
		js.executeScript("arguments[0].click();", button);		
		
		
		/*****************TEXTBOX ELEMENT ACTIONS*****************/
		
//		Locate the textbox using XPath locator.
		WebElement textbox = driver.findElement(By.xpath("//input[@attribute='attribute-value']"));
		
//		Clear the text box.
		textbox.clear();
		
//		Enter the text into the text box.
		textbox.sendKeys("Sample Text");
		
//		Verify the placeholder text within the text box element.
		String placeholderText = textbox.getAttribute("placeholder");
		System.out.println("Placeholder Text: " + placeholderText);
		
//		Enter the text along with function keys.
		textbox.sendKeys("Sample Text", Keys.ENTER);
		actions.sendKeys(textbox, "Sample Text").sendKeys(Keys.ENTER).perform();
		
//		Enter the text into hidden/disabled textbox using JavaScriptExecutor
		js.executeScript("arguments[0].value='Sample Text';", textbox);		
		
		/*****************DROPDOWN ELEMENT ACTIONS*****************/
		
//		Locate the dropdown using XPath locator.
		WebElement dropdown = driver.findElement(By.xpath("//select[@attribute='attribute-value']"));
		
//		Verify whether the drop-down is single selection or multi-select drop-down.
		Select select = new Select(dropdown);
		boolean isMultiple = select.isMultiple();//true = multi-select, false = single select
		
//		Select the option from the drop-down.
		select.selectByVisibleText("Option 1");
		select.selectByValue("option1");
		select.selectByIndex(1);
		
//		Select/De-select the option from the multi-select drop-down.
		if(isMultiple) {
			select.selectByVisibleText("Option 1");
			select.selectByValue("option1");
			select.selectByIndex(1);
			select.deselectByVisibleText("Option 1");
			select.deselectByValue("option1");
			select.deselectByIndex(1);
			select.deselectAll();
		}
		
//		Verify the selected option from the drop-down.
		String selectedOption = select.getFirstSelectedOption().getText();
		
//		Verify all the options available within the drop-down.
		List<WebElement> optionElements = select.getOptions();
		for(WebElement optionElement : optionElements) {
			System.out.println("Option: " + optionElement.getText());
		}
		
		/*****************CHECKBOX ELEMENT ACTIONS*****************/
		
//		Locate the checkbox using XPath locator.
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @attribute='attribute-value']"));
		
// 		Check the checkbox if not already checked.
		if(!checkbox.isSelected()) {
			checkbox.click();
		}		
		
		/*****************RADIO BUTTON ELEMENT ACTIONS*****************/
		
//		Locate the radio button using XPath locator.
		WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @attribute='attribute-value']"));
		
// 		Select the radio button
		radioButton.click();
		
		/*****************IMAGE ELEMENT ACTIONS*****************/
		
//		Locate the image using XPath locator.
		WebElement image = driver.findElement(By.xpath("//img[@attribute='attribute-value']"));
		
//		Verify whether the image is displayed or not.
		boolean isImageDisplayed = image.isDisplayed();
		System.out.println("Is Image Displayed: " + isImageDisplayed);
		
//		Verify whether the correct image is displayed by using the source path of the image.
		String imageSrc = image.getAttribute("src");
		System.out.println("Image Source Path: " + imageSrc);
		
//		Verify the size of the image or resolution of the image.
		int imageWidth = image.getSize().getWidth();
		int imageHeight = image.getSize().getHeight();
		System.out.println("Image Width: " + imageWidth);
		System.out.println("Image Height: " + imageHeight);
		
//		Verify the position of the image.
		int imageX = image.getLocation().getX();
		int imageY = image.getLocation().getY();
		System.out.println("Image X Position: " + imageX);
		System.out.println("Image Y Position: " + imageY);
		
//		Verify the color of the specific pixel within the image.
		int pixelColor = ImageIO.read(new URL(imageSrc)).getRGB(imageX, imageY);
		
		/*****************HYPERLINK ELEMENT ACTIONS*****************/
		
//		Locate the hyperlink using XPath locator.
		WebElement hyperlink = driver.findElement(By.xpath("//a[@attribute='attribute-value']"));
		
//		Verify the hyperlink by using HREF of value.(method 1
		String hyperlinkHref = hyperlink.getAttribute("href");
		System.out.println("Hyperlink HREF: " + hyperlinkHref);
		
//		Verify the hyperlink by click on the link and verify the updated URL.(method 2)
		hyperlink.click();
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL after clicking the hyperlink: " + currentURL);
		
		/*****************TEXT ELEMENT ACTIONS*****************/
		
//		Locate the text element using XPath locator.
		WebElement textElement = driver.findElement(By.xpath("//tag[@attribute='attribute-value']"));
		
//		if text is text value in html
		String textValue = textElement.getText();
		
//		if text is in attribute
		String textAttValue = textElement.getAttribute("attribute-name");
		
		/*****************UPLOAD ELEMENT ACTIONS*****************/
		
//		Locate the upload element using XPath locator.
		WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file' and @attribute='attribute-value']"));
		
//		Upload the file by specifying the file path.
		uploadElement.sendKeys("C:\\path\\to\\your\\file.txt");
		
		/*********************ALERT HANDLING ACTIONS*********************/
		Alert alert = driver.switchTo().alert();
		
	}

}

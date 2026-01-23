package selenium.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions5 {
	
	//Search for the book 'Selenium' in the PWA Book application (https://books-pwakit.appspot.com/)

	public static void main(String[] args) {
		
		//1.Launch Chrome Browser	
		WebDriver driver = new ChromeDriver();
		
		//2.Maximize the browser window	
		driver.manage().window().maximize();
		
		//3.Launch the application	(https://books-pwakit.appspot.com/)	
		driver.get("https://books-pwakit.appspot.com/");
		
		//4. Locate the shadow host element( the element which hosts the shadow DOM)
		WebElement shadowHost = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		
		//5. Get the shadow root along with all the hidden elements.
		SearchContext shadowRoot =shadowHost.getShadowRoot();
		
		//6.Locate the search box and enter 'Selenium'
		WebElement searchBox = shadowRoot.findElement(By.cssSelector("input[id='input']"));
		searchBox.sendKeys("Selenium");
		
		//5.Close browser window
		driver.quit();

	}

}

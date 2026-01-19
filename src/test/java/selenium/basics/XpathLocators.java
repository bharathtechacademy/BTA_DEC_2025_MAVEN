package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//XPath : XML Path 

//Absolute Xpath : It starts with single slash (/) and it defines the complete path from root element to the desired element. (Ex: /html/body/div[1]/div[1]/a[2]/img)

//Relative Xpath : It starts with double slash (//) and it defines the path from

/*************LEVEL 1 : BASIC XPATH********************************************/
//Syntax 1: //tagname[@attribute='attribute-value']
//Syntax 2: //tagname[text()='text-value']

/*************LEVEL 2 : XPATH with contains & starts-with**********************/
//Syntax 3: //tagname[contains(@attribute,'attribute-value')]
//Syntax 4: //tagname[contains(text(),'text-value')]
//Syntax 5: //tagname[starts-with(@attribute,'attribute-value')]
//Syntax 6: //tagname[starts-with(text(),'text-value')]

/*************LEVEL 3 : Combine multiple attributes & text values using 'and'**/
//Syntax 7: //tagname[@attribute1='attribute-value' and @attribute2='attribute-value' and text()='text-value']

/*************LEVEL 4 : Advanced XPath with relationship**********************/
//Syntax 8: referenceXpath/relationship::targetXpath

// target -> sibling --> parent --> ancestor --> ancestor's parent

//child
//parent
//ancestor
//following-sibling
//preceding-sibling
//following
//preceding
// // -> anywhere with in the family
// / -> child


//ancestor: //ul[@class='leftmenu']
//parent: //li
//sibling: N/A
//target: //a[text()='Services']

//ul[@class='leftmenu']/child::li/child::a[text()='Services']
//ul[@class='leftmenu']//a[text()='Services']
//li[text()='Solutions']/following-sibling::li/child::a[text()='Services']

public class XpathLocators {

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)    
		WebDriver driver = new ChromeDriver();
	
//		2. Maximize the browser window   		
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate the 'Logo'  by using 'xpath' locator syntax 1
		driver.findElement(By.xpath("//img[@class='logo']"));
		
//		6. Locate the 'Caption'  by using 'xpath' locator syntax 2
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		
//		7. Locate the 'Logo'  by using 'xpath' locator syntax 3
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
		
//		8. Locate the 'Caption'  by using 'xpath' locator syntax 4
		driver.findElement(By.xpath("//p[contains(text(),'Experience')]"));
				
//		9. Locate the 'Logo'  by using 'xpath' locator syntax 5
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));
		
//		10. Locate the 'Caption'  by using 'xpath' locator syntax 6
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		11. Locate the 'Logo'  by using 'xpath' locator syntax 7
		driver.findElement(By.xpath("//img[@alt='ParaBank' and @class='logo' and @title='ParaBank']"));
		
//		12. Locate the 'Caption'  by using 'xpath' locator syntax 7
		driver.findElement(By.xpath("//p[@class='caption' and text()='Experience the difference']"));
		
//		13. Locate the 'Services' link  by using 'xpath' locator syntax 8
		driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));

	}

}

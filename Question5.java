package Assignment;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
/*Using Junit and WebDriver script, open https://www.premierleague.com/ in Firefox and do the below: (11 points)

1. Click on Tables from the header (1 point)
2. From the tables, open ‘Manchester City’ club in a new window via context-click (3 points)
3. Find official website URL on the page and print on the console from a newly opened window (3 points)
4. Print the page title of the newly opened window (1 point)
5. Go back to the main window (2 points)
6. Print the page title again (1 point)*/


public class Question5 {
 static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.premierleague.com/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//ul[contains(@class,'showMoreEnabled')]//a[contains(@class,'')][contains(text(),'Tables')]")).click();
		//driver.get("https://www.premierleague.com/");
		//driver.findElement(By.xpath("//ul[contains(@class,'showMoreEnabled')]//a[contains(@class,'')][contains(text(),'Tables')]")).click();
		driver.findElement(By.xpath("//*[@id=\"advertClose\"]")).click();
		driver.get("https://www.premierleague.com/tables");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//tbody[@class='tableBodyContainer isPL']//span[@class='long'][contains(text(),'Manchester City')]")));
		
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//tbody[@class='tableBodyContainer isPL']//span[@class='long'][contains(text(),'Manchester City')]"));
		actions.contextClick(elementLocator).perform();
		
		
	
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
	}

}

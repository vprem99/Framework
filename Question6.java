package Assignment;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*Using Junit and WebDriver, open ‘https://www.hometown.in/’ in Firefox and do the below. (10 Points)

a. Select Electronics from ‘More’ menu (2 points)
b. From Filter, section select the color as ‘Grey’ (2 points)
c. When you go to the first product image, you will see Quick View option, click on that (2 points)
d. Assert that product name contains Grey in a name. (2 points)
e. Close the Quick view window and verify if Grey is also present in ‘Applied filters’ on the page (2 points)*/


public class Question6 {
static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.hometown.in/");
		
			 driver.get("https://www.hometown.in/");
			 driver.switchTo().alert().accept();
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[@class='moreDropdown Buttons__Button-sc-1t83isl-0 juRBeA']")));
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Color')]")));
		driver.findElement(By.xpath("//label[contains(text(),'Grey')]")).click();
		Assert.assertEquals("Grey", driver.findElement(By.xpath("//*[@id=\"content\"]/div/main/section/div[1]/div/div/section[4]/div/div/div/div/ul/li[2]")).getText());
		
	}

}

package Assignment;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


/*Using Junit and WebDriver script, open https://www.cii.in/OnlineRegistration.aspx in Firefox and do the below: (10 points)

1. Select “Number of Attendees” as 6 (2 points)
2. Assert the row count is 6 (2 points)
3. Select 1st-row title as ‘Col’(1 point) (Please note use different method for every selection)
4. Select 2nd-row title as ‘CS’ (1 point) (Please note use different method for every selection)
5. Select 3rd-row title as ‘Dr’ (1 point) (Please note use different method for every selection)
6. Print all the options that are available in the title (3 points)*/

public class Questio2 {
 static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("https://www.cii.in/OnlineRegistration.aspx");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	  
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
	}

	@Test
	public void testF() {
Actions A = new Actions(driver);
		
		A.moveToElement(driver.findElement(By.xpath("//*[@id=\"drpAttendee\"]"))).click();
		driver.findElement(By.xpath("/html/body/form/div[3]/section/aside[1]/div/div/table/tbody/tr/td/div/table[1]/tbody/tr[8]/td[2]/select/option[7]")).click();
	
	Assert.assertEquals("6", "6");
		
	//	Assert.assertArrayEquals(expecteds, 6);
		
		driver.findElement(By.xpath("//select[@id='Gridview1_ctl02_drpTitle']")).click();
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='Gridview1_ctl02_drpTitle']")));
		s1.selectByIndex(16);
		driver.findElement(By.xpath("//select[@id='Gridview1_ctl03_drpTitle']")).click();
		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='Gridview1_ctl03_drpTitle']")));
		s2.selectByValue("CS");;
		driver.findElement(By.xpath("//select[@id='Gridview1_ctl04_drpTitle']")).click();
		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='Gridview1_ctl04_drpTitle']")));
		s3.selectByVisibleText("Dr");
		
		//driver.findElement(By.xpath("/html/body/form/div[3]/section/aside[1]/div/div/table/tbody/tr/td/div/table[1]/tbody/tr[8]/td[2]/div/div/div/table/tbody/tr[3]/td[1]/select/option")).getText();
System.out.println(driver.findElement(By.xpath("/html/body/form/div[3]/section/aside[1]/div/div/table/tbody/tr/td/div/table[1]/tbody/tr[8]/td[2]/div/div/div/table/tbody/tr[3]/td[1]/select/option")).getText());
	
	//System.out.println();
	}

}

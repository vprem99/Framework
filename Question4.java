package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*Open the link https://www.woodlandworldwide.com/ on the browser now search for the items related to the below-given product names.

Test1: Use the product name “Bags”
Test2: Use product name “Leather” and
Test3: Use the product name “Full Sleeve”.

These product names are to be saved in an Excel file, read the product names from this file and pass to the search box.
Select the filter ‘Low to High’ and test whether the first 8 products are in ascending order of the price.
Write a script for Google chrome in TestNG using WebDriver. (12 points)*/

public class Question4 {
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  
	  
	  
	 FileInputStream IP= new FileInputStream("C:\\Users\\vshadmin\\Desktop\\Question4.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(IP);
	  XSSFSheet sheet = wb.getSheet("Sheet1");
	

	  for(int i=0; i<sheet.getLastRowNum();i++)
{		
		  String data= sheet.getRow(i).getCell(0).toString();
		  driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div")).click();
		  driver.findElement(By.xpath("//input[@id='searchkey']")).sendKeys(data);
		  driver.findElement(By.id("searchBtn")).click();
		  driver.findElement(By.xpath("//*[@id=\"sortByForm\"]/ul/li[4]/label")).click();
		  
  }
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.woodlandworldwide.com/");
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	 
  }
}
  
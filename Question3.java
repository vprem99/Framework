package Assignment;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*Using TestNG and WebDriver script, open https://www.meripustak.com/ in Google Chrome and do the below: .(12 Points)

1. Print the width and height of the logo. (2 points)
2. Under Follow us section on the bottom, extract and print the href of ‘Google’ social media icon (Right a script in such a way, if position of ‘Google icon is changed tomorrow in the social media icons, our script should work) (3 points)
3. Click on shopping cart when item in cart is 0 (1 point)
4. Assert the message in the shopping cart table “No Item is Added In Cart yet.Cart is Empty!!!” (2 points)
5. Add any one ‘History’ book in cart (2 points)
6. Verify if this message exist in the shopping cart table “No Item is Added In Cart yet.Cart is Empty!!!” (2 point
*/
public class Question3 {
	WebDriver driver;
	
	
  @Test
  public void test() throws Exception {
	  
	  
	 WebElement w= driver.findElement(By.xpath("//*[@id=\"form1\"]/footer/div/div[6]/div/a[4]"));
	 System.out.println("href for google is "+w.getAttribute("href"));
	 
	 driver.findElement(By.xpath("//*[@id=\"myHeader\"]/nav/div[1]/div[2]/div[2]/a[1]/i")).click();
	 String w1=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCartTable\"]/tbody/tr/td/h4")).getText();
	 assertEquals(w1,"No Item is Added In Cart yet.Cart is Empty!!!");
	 driver.findElement(By.xpath("//a[contains(text(),'Continue Shopping')]")).click();
	 driver.findElement(By.xpath("//input[@id='txtsearch']")).click();
	 driver.findElement(By.xpath("//input[@id='txtsearch']")).sendKeys("History");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"btnsearch\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"book_list\"]/ul/li[1]")).click();
	 driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_AddtoCart']")).click();
	 
	// assert.assertEquals(w1,"No Item is Added In Cart yet.Cart is Empty!!!");
	 assertEquals(w1,"No Item is Added In Cart yet.Cart is Empty!!!");
	// assert.assertEquals(w1,"No Item is Added In Cart yet.Cart is Empty!!!");
  }


  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.meripustak.com/");
	  driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
  }

  @AfterClass
  public void afterClass() {
  }

}

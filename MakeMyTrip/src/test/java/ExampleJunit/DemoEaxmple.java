package ExampleJunit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import POM.BrowserFactory;

public class DemoEaxmple {
	WebDriver w;
	@Before
	public void setUp() throws Exception
	{
		w=BrowserFactory.startBrowser("C:\\Users\\AW104_PC1\\Desktop\\Screen\\geckodriver.exe");
		System.out.println("You are in  Before Example1 ");

	}
	@After
	public void tearDown() throws Exception 
	{
		w.quit();
		System.out.println("You are in  After Example1 ");

	}
	@Test
	public void test() 
	{
		Assert.assertEquals("ABC",w.getTitle());	
	}

}

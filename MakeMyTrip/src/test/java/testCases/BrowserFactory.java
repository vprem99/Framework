package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{

	private static WebDriver w;
	public static WebDriver startBrowser(String Location)
	{
		if(Location.contains("chrome") )
		{
			System.setProperty("webdriver.chrome.driver", Location);
			w=new ChromeDriver();
		}
		else if(Location.contains("gecko") )
		{
			System.setProperty("webdriver.gecko.driver", Location);
			w=new FirefoxDriver();
		}
		
		return w;
		
	}
}

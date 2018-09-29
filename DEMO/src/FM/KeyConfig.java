package FM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyConfig
{
	static WebDriver w;
	public static void openBrowser(String Location)
	{
		if(Location.contains("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",Location);
		w=new ChromeDriver();
		}
		else if(Location.contains("gecko"))
		{
		System.setProperty("webdriver.gecko.driver",Location);
		w=new FirefoxDriver();
		}
	}
	
	public static void openUrl(String URL)
	{
		w.get(URL);
	}
	
	public static void enterText(String Locator,String LocatorValue,String inputdata)
	{
		switch(Locator)
		{
		case "name":
			w.findElement(By.name(LocatorValue)).sendKeys(inputdata);
			break;
		case "id":
			w.findElement(By.id(LocatorValue)).sendKeys(inputdata);
			break;
		case "css":
			w.findElement(By.cssSelector(LocatorValue)).sendKeys(inputdata);
			break;
		case "link":
			w.findElement(By.linkText(LocatorValue)).sendKeys(inputdata);
			break;
		case "xpath":
			w.findElement(By.xpath(LocatorValue)).sendKeys(inputdata);
			break;
		default:
			System.out.println("Invalid Locator Specified");
		}
	}
	public static void click(String Locator,String LocatorValue)
	{
		switch(Locator)
		{
		case "name":
			w.findElement(By.name(LocatorValue)).click();;
			break;
		case "id":
			w.findElement(By.id(LocatorValue)).click();;
			break;
		case "css":
			w.findElement(By.cssSelector(LocatorValue)).click();;
			break;
		case "link":
			w.findElement(By.linkText(LocatorValue)).click();;
			break;
		case "xpath":
			w.findElement(By.xpath(LocatorValue)).click();;
			break;
		default:
			System.out.println("Invalid Locator Specified");	
		}}
	public static void closeBrowser()
	{
	w.quit();
	}

}

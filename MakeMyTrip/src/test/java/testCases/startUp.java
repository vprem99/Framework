package testCases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class startUp 
{
	static WebDriver w;
	static Properties p;
	static LoginFactory LF;
	static SignUpFactory SF;
	
	@BeforeSuite
	public void BeforeSuite() throws Exception
	{
		p=new Properties();
		p.load(new FileInputStream(".\\PATHS.property"));
		
		
		w=BrowserFactory.startBrowser(p.getProperty("CPATH"));
		SF=new SignUpFactory(w);
		LF=new LoginFactory(w);

		w.get(p.getProperty("URL"));
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		w.quit();
	}
}

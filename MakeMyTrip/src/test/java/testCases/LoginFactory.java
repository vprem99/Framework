package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory
{
	WebDriver w;
	LoginFactory(WebDriver iDriver)
	{
		this.w=iDriver;
		PageFactory.initElements(w, this);
	}
	@FindBy(id="ch_login_icon") WebElement E_LOGIN;
	@FindBy(id="ch_login_email") WebElement E_EM;
	@FindBy(id="ch_login_password") WebElement E_PWD;
	@FindBy(id="ch_login_btn") WebElement E_LG;
	//@FindBy(xpath="//*[contains(text(),'')]")


	public void Login(String data)
	{
		String dataA[]=data.split(",");

		E_LOGIN.click();
		E_EM.sendKeys(dataA[0]);
		E_PWD.sendKeys(dataA[1]);
		E_LG.click();
		
	}
	
	
	
	
}

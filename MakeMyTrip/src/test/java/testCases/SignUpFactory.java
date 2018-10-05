package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpFactory 
{ 
	WebDriver w;
	SignUpFactory(WebDriver iDriver)
	{
		this.w=iDriver;
		PageFactory.initElements(w, this);
	}
	
	
	@FindBy(id="ch_signup_icon") WebElement E_SIGNUP;
	@FindBy(id="ch_signup_email") WebElement E_EM;

	@FindBy(id="ch_signup_phone") WebElement E_NUM;

	@FindBy(id="ch_signup_password") WebElement E_PWD;

	@FindBy(id="ch_signup_btn") WebElement E_SIGNUPB;

	public void SIGNUP(String data) throws Exception
	{
		String dataA[]=data.split(",");
		E_SIGNUP.click();
		WebDriverWait wt=new WebDriverWait(w, 20);
		wt.until(ExpectedConditions.visibilityOf(E_EM));
		E_EM.sendKeys(dataA[0]);
		E_NUM.sendKeys(dataA[1]);
		E_PWD.sendKeys(dataA[2]);
		E_SIGNUPB.click();
		Thread.sleep(3000);
		w.navigate().refresh();
	}
}

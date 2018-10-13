package testCases;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchFactory
{
	WebDriver w;
	searchFactory(WebDriver iDriver)
	{
		this.w=iDriver;
		PageFactory.initElements(w, this);
	}
	@FindBy(id="hp-widget__sfrom") WebElement E_FR;
	@FindBy(xpath="//*[@class='autoCompleteItem']") List<WebElement> E_FRSUG;
	@FindBy(id="ch_login_password") WebElement E_PWD;
	@FindBy(id="ch_login_btn") WebElement E_LG;

	public void search(String data)
	{
		try {
			Thread.sleep(3000);
			String dataA[] = data.split(",");
			E_FR.click();
			E_FRSUG.get(1).click();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}




}

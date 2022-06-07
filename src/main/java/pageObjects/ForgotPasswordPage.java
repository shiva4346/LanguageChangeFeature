package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	WebDriver driver;
	public ForgotPasswordPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='forgot-password-form']/span[@data-auto-key='fp-title']") WebElement ForgotPasswordText;
	@FindBy(xpath="//div[@class='go-back']/i") WebElement gobackicon;
	
	public WebElement ForgotPasswordText() {
		return ForgotPasswordText;
	}
	public WebElement gobackicon() {
		return gobackicon;
	}
}

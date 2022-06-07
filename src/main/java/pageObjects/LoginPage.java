package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	  @FindBy(id="q-login-username") WebElement username; 
	  @FindBy(id="q-login-password") WebElement password;
	  @FindBy(id="q-login-button") WebElement signInButton;
	  @FindBy(xpath="//mat-select[@role='combobox']/div/div[2]") WebElement languagedropdown;
	  @FindBy(xpath="//mat-option[@role='option']/span") List<WebElement> activelanguages;
	  @FindBy(xpath="//mat-option[@aria-selected='true']/span") WebElement selectedLanguage;
	  @FindBy(xpath="//div[@data-auto-key='login-title']") WebElement SignInText;
	  @FindBy(xpath="//div[contains(@class,'forgot-password')]/a") WebElement forgotpasswordlink;
	 
	
	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement signInButton() {
		return signInButton;
	}
	
	public WebElement languagedropdown() {
		return languagedropdown;
	}
	
	public List<WebElement> activelanguages() {
		return activelanguages;
	}
	
	public WebElement selectedLanguage() {
		return selectedLanguage;
	}
	
	public WebElement SignInText() {
		return SignInText;
    }
	
	public WebElement forgotpasswordlink() {
		return forgotpasswordlink;
    }
	
}

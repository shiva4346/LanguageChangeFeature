package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppearancePage {


	WebDriver driver;
	public AppearancePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-auto-key='advanced']/span[1]") WebElement Advancedtab;
	@FindBy(xpath="//mat-form-field[@data-auto-key='d-default-language']/div/div[1]/div/mat-select/div/div[2]/div") WebElement Defaultlanguagedropdown;
	@FindBy(xpath="//mat-option[@role='option']/span") List<WebElement> languagesinDefaultDropdown;
	
	public WebElement Advancedtab() {
		return Advancedtab;
	}
	
	public WebElement Defaultlanguagedropdown() {
		return Defaultlanguagedropdown;
	}
	
	public List<WebElement> languagesinDefaultDropdown() {
		return languagesinDefaultDropdown;
	}
	
	
}

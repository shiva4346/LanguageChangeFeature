package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PublicDashboardPage {

	WebDriver driver;
	public PublicDashboardPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//mat-select[@role='combobox']/div/div[2]") WebElement languagedropdownpublicpage;
	@FindBy(xpath="//mat-option[@role='option']/span") List<WebElement> activelanguagespublicpage;
	@FindBy(xpath="//i[@class='fa-circle fas']/parent::span") WebElement selectedlanguagepublicpage;
	@FindBy(xpath="//span[contains(@class,'panel-title')]/span") WebElement widgettitletextpublicpage;
	
	public WebElement languagedropdownpublicpage() {
		return languagedropdownpublicpage;
	}
	
	public List<WebElement> activelanguagespublicpage() {
		return activelanguagespublicpage;
	}
	
	public WebElement selectedlanguagepublicpage() {
		return selectedlanguagepublicpage;
	}
	
	public WebElement widgettitletextpublicpage() {
		return widgettitletextpublicpage;
	}
	
}

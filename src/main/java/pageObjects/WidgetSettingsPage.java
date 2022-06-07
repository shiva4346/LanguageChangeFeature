package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WidgetSettingsPage {
	
	WebDriver driver;
	public WidgetSettingsPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@role='tab']/div[text()='Dataset' or text()='Súbor údajov']") WebElement Datasettab;
	@FindBy(xpath="//button[@data-auto-key='w-new-dataset']/span[text()=' New Dataset ' or text()=' Nová množina údajov ']") WebElement newdatasetbutton;
	@FindBy(xpath="//input[@data-placeholder='Data Source' or @data-placeholder='Zdroj dát']") WebElement datasourcefield;
	@FindBy(xpath="//button[@data-auto-key='q-action-button']/span[text()='Submit' or text()='Predložiť']") WebElement submitbutton;
	@FindBy(xpath="//div[@id='toast-container']/div/div") WebElement updatetoaster;
	@FindBy(xpath="//button[@data-auto-key='w-close-icon']/span/i") WebElement widgetcloseicon;
	@FindBy(xpath="//mat-option/span[text()=' shiva_multi ']") WebElement datasetname;
	
	public WebElement Datasettab() {
		return Datasettab;
    }
	
	public WebElement newdatasetbutton() {
		return newdatasetbutton;
    }
	
	public WebElement datasourcefield() {
		return datasourcefield;
    }
	
	public WebElement submitbutton() {
		return submitbutton;
    }
	
	public WebElement updatetoaster() {
		return updatetoaster;
    }
	
	public WebElement widgetcloseicon() {
		return widgetcloseicon;
    }
	
	public WebElement datasetname() {
		return datasetname;
    }
	
	
	
	
	

}

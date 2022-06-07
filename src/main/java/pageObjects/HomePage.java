package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(@class,'profile-tab')]/div") WebElement userprofileicon;
	@FindBy(xpath="//button[@data-auto-key='q-sign-out']/span[2]") WebElement signouttext;
	@FindBy(xpath="//button[@data-auto-key='q-button']/span[text()=' Confirm ']") WebElement confirmbutton;
	@FindBy(xpath="//button[@data-auto-key='q-lang-selection']/i") WebElement languagedropdownhomepage;
	@FindBy(xpath="//button[@role='menuitem']") List<WebElement> activelanguageshomepage;
	@FindBy(xpath="//i[@class='fa-circle fas']/parent::button") WebElement selectedlanguagehomepage;
	@FindBy(xpath="//button[@data-auto-key='q-menu']/span/i") WebElement Menuicon;
	@FindBy(xpath="//button[@data-auto-key='menu-admin']/span/span") WebElement Adminpanelbutton;
	@FindBy(xpath="//mat-card[@data-auto-key='menu-appearance']/div[2]") WebElement Appearancebutton;
	@FindBy(xpath="//div[@data-auto-key='d-setting-btn']/button/span/span") WebElement Settingstext;
	@FindBy(xpath="//button[@data-auto-key='d-select-dropdown-btn']/span/div/i") WebElement searchdashboarddropdown;
	@FindBy(xpath="//button[@data-auto-key='d-new']/span/span") WebElement newdashboardbutton;
	@FindBy(xpath="//input[@data-placeholder='Dashboard Title' or @data-placeholder='Názov hlavného panela']") WebElement dashboardtitleinputfield;
	@FindBy(xpath="//i[@data-auto-key='d-add-category-icon']") WebElement dashboardcategoryicon;
	@FindBy(xpath="//input[@data-placeholder='New Category' or @data-placeholder='Nová kategória']") WebElement newcategoryinputfield;
	@FindBy(xpath="//button[@data-auto-key='d-button']/span[text()=' Create ' or text()=' Vytvorte ']") WebElement dashboardcreatebutton;
	@FindBy(xpath="//div[@id='toast-container']/div/div") WebElement dashboardcreatetoaster;
	@FindBy(xpath="//div[@id='toast-container']/div/div") WebElement dashboardUpdateToaster;
	@FindBy(xpath="//button[@data-auto-key='d-add-widgets']/span/span") WebElement addwidgetbutton;
	@FindBy(xpath="//div[@data-auto-key='q-list-item']/div/a[text()=' General ' or text()=' generál ']") WebElement generalbutton;
	@FindBy(xpath="//span[text()='Charts' or text()='Grafy']/parent::div/following-sibling::div/button/span[text()='Add' or text()='Pridať']") WebElement chartsaddbutton;
	@FindBy(xpath="//div[@data-auto-key='d-setting-btn']/button/span/span") WebElement dashboardsettingsicon;
	@FindBy(xpath="//mat-slide-toggle[@data-auto-key='d-info-public']/label/div/div") WebElement publictogglebutton;
	@FindBy(xpath="//button[@data-auto-key='q-action-button']/span[text()='Update' or text()='Aktualizovať']") WebElement dashboardupdatebutton;
	@FindBy(xpath="//div[@class='image-url']/img") WebElement copyURLicon;
	@FindBy(xpath="//div[@id='toast-container']/div/div") WebElement publicdashboardtoaster;
	
	public WebElement userprofileicon() {
		return userprofileicon;
	}
	
	public WebElement signouttext() {
		return signouttext;
	}
	
	public WebElement confirmbutton() {
		return confirmbutton;
	}
	
	public WebElement languagedropdownhomepage() {
		return languagedropdownhomepage;
	}
	
	public List<WebElement> activelanguageshomepage() {
		return activelanguageshomepage;
	}
	
	public WebElement selectedlanguagehomepage() {
		return selectedlanguagehomepage;
	}
	
	public WebElement Menuicon() {
		return Menuicon;
	}
	
	public WebElement Adminpanelbutton() {
		return Adminpanelbutton;
	}
	
	public WebElement Appearancebutton( ) {
		return Appearancebutton;
	}
	
	public WebElement Settingstext( ) {
		return Settingstext;
	}
	
	public WebElement searchdashboarddropdown( ) {
		return searchdashboarddropdown;
	}
	
	public WebElement newdashboardbutton( ) {
		return newdashboardbutton;
	}
	
	public WebElement dashboardtitleinputfield( ) {
		return dashboardtitleinputfield;
	}
	
	public WebElement dashboardcategoryicon( ) {
		return dashboardcategoryicon;
	}
	
	public WebElement newcategoryinputfield( ) {
		return newcategoryinputfield;
	}
	
	public WebElement dashboardcreatebutton( ) {
		return dashboardcreatebutton;
	}
	
	public WebElement dashboardcreatetoaster( ) {
		return dashboardcreatetoaster;
	}
	
	public WebElement dashboardUpdateToaster( ) {
		return dashboardUpdateToaster;
	}
	
	public WebElement addwidgetbutton( ) {
		return addwidgetbutton;
	}
	
	public WebElement generalbutton( ) {
		return generalbutton;
	}
	
	public WebElement chartsaddbutton( ) {
		return chartsaddbutton;
	}
	
	public WebElement dashboardsettingsicon( ) {
		return dashboardsettingsicon;
	}
	
	public WebElement publictogglebutton( ) {
		return publictogglebutton;
	}
	
	public WebElement dashboardupdatebutton( ) {
		return dashboardupdatebutton;
	}
	
	public WebElement copyURLicon( ) {
		return copyURLicon;
	}
	
	public WebElement publicdashboardtoaster( ) {
		return publicdashboardtoaster;
	}
	
	
}

package featureMethods;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import base.Commonmethods;
import pageObjects.AppearancePage;
import pageObjects.ForgotPasswordPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PublicDashboardPage;
import pageObjects.WidgetSettingsPage;

public class LanguageImprovementMethods extends Commonmethods{

	public static LoginPage lp;
	public static ForgotPasswordPage fp;
	public static HomePage hp;
	public static AppearancePage ap;
	public static WebDriverWait w;
	public static int tenantactivelanguages=0;
	public static PublicDashboardPage pdp;
	public static JavascriptExecutor js;
	public static String mainwindow="";
	
	
	
	public static void navigateToAppearance() throws InterruptedException {
		softassert=new SoftAssert();
		action=new Actions(driver);
		implicitWait();
		hp=new HomePage(driver);
		action.moveToElement(hp.Menuicon()).click().build().perform();
		driverWait(8000);
		action.moveToElement(hp.Adminpanelbutton()).click().build().perform();
		driverWait(8000);
		action.moveToElement(hp.Appearancebutton()).click().build().perform();
		driverWait(8000);
		if(driver.getTitle().equalsIgnoreCase("Quantela Application - Branding"))
		{
			log.info("Navigated to Apperance submodule");
		}
		else
		{
		//	softassert.fail("Failed to naviagate to Apperance submodule");
		}
		
	}
	
	public static void navigateToAdvanced() throws InterruptedException {
		driverWait(5000);
		action=new Actions(driver);
		ap=new AppearancePage(driver);
		action.moveToElement(ap.Advancedtab()).click().build().perform();
		driverWait(5000);
		if(driver.getTitle().equalsIgnoreCase("Quantela Application - Advanced"))
		{
			log.info("Navigated to Advanced tab");
		}
		else
		{
			softassert.fail("Failed to naviagate to Advanced tab");
		}
		
	}
	
	public static void click(WebElement element) {
		w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void activelanguagesAdminpanel() throws InterruptedException {
		action=new Actions(driver);
		action.moveToElement(ap.Defaultlanguagedropdown()).click().build().perform();
		driverWait(5000);
		tenantactivelanguages=ap.languagesinDefaultDropdown().size();
		ap.languagesinDefaultDropdown().get(0).click();
		driverWait(5000);
		if(tenantactivelanguages!=0)
		{
			log.info("Number of active languages in the Tenant are: "+tenantactivelanguages);
		}
		else 
		{
			softassert.fail("Failed to get the active languages count in the Tenant");
		}
	}
	
	
	public static void languageDropdownPresence(String present) throws InterruptedException {
		driverWait(3000);
		lp=new LoginPage(driver);
		softassert=new SoftAssert();
		Boolean dropdownpresence=lp.languagedropdown().isDisplayed();
	    if(dropdownpresence=false)
	    {
	    	softassert.fail("Language dropdown is not present in "+present);
	    }
	    else
	    {
	    	log.info("Language dropdown is present in "+present);
	    }
	}
	
	public static void languageDropdownPresencehomepage(String page) throws InterruptedException {
		implicitWait();
		driverWait(3000);
		hp=new HomePage(driver);
		softassert=new SoftAssert();
		Boolean dropdownpresence=hp.languagedropdownhomepage().isDisplayed();
	    if(dropdownpresence=false)
	    {
	    	softassert.fail("Language dropdown is not present in "+page);
	    }
	    else
	    {
	    	log.info("Language dropdown is present in "+page);
	    }
	}
	
	public static void languageDropdownPresencepublicdashboardpage(String page) throws InterruptedException {
		implicitWait();
		driverWait(3000);
		pdp=new PublicDashboardPage(driver);
		softassert=new SoftAssert();
		Boolean dropdownpresence=pdp.languagedropdownpublicpage().isDisplayed();
	    if(dropdownpresence=false)
	    {
	    	softassert.fail("Language dropdown is not present in "+page);
	    }
	    else
	    {
	    	log.info("Language dropdown is present in "+page);
	    }
	}
	
	public static void languageDropdownEnable(String enable ) {
		softassert=new SoftAssert();
		Boolean dropdownenable=lp.languagedropdown().isEnabled();
		if(dropdownenable=false)
	    {
	    	softassert.fail("Language dropdown is not enabled in "+enable);
	    }
	    else
	    {
	    	log.info("Language dropdown is enabled in "+enable);
	    }
	}
	
	public static void languageDropdownEnablehomepage(String page) {
		softassert=new SoftAssert();
		Boolean dropdownenable=hp.languagedropdownhomepage().isEnabled();
		if(dropdownenable=false)
	    {
	    	softassert.fail("Language dropdown is not enabled in "+page);
	    }
	    else
	    {
	    	log.info("Language dropdown is enabled in "+page);
	    }
	}
	
	public static void languageDropdownEnablepublicdashboardpage(String page ) {
		softassert=new SoftAssert();
		pdp=new PublicDashboardPage(driver);
		Boolean dropdownenable=pdp.languagedropdownpublicpage().isEnabled();
		if(dropdownenable=false)
	    {
	    	softassert.fail("Language dropdown is not enabled in "+page);
	    }
	    else
	    {
	    	log.info("Language dropdown is enabled in "+page);
	    }
	}
	
	public static void languagechange(String targetlanguage, String page) throws InterruptedException {
		action=new Actions(driver);
		softassert=new SoftAssert();
		w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(lp.languagedropdown()));
		action.moveToElement(lp.languagedropdown()).click().build().perform();
		driverWait(8000);
		List<WebElement> activelangs=lp.activelanguages();
		log.info("Number of active languages in "+page+" are: "+activelangs.size());
	    int p=activelangs.size();
	    if(p==tenantactivelanguages)
	    {
	    	log.info("Number of active languages in "+page+" are matching with AdminPanel active languages");
	    }
	    else
	    {
	    	softassert.fail("Number of active languages in "+page+" are not matching with AdminPanel active languages");
	    }
	    String selectedlanguage=lp.selectedLanguage().getText().trim();
	    log.info("Default selected language in "+page+" is: "+selectedlanguage);   
	    String currentlanguage="";
	    if(selectedlanguage.equalsIgnoreCase(targetlanguage))
	    {
	    	lp.selectedLanguage().click();
	    	log.info("The langauge is already selected");
	    }
	    else
	    {
	    	
	    	for(int i=0;i<activelangs.size();i++)
	    	{
	    		currentlanguage=activelangs.get(i).getText().trim();
	    		if(currentlanguage.equalsIgnoreCase(targetlanguage))
	    		{
	    			activelangs.get(i).click();	
	    			break;
	    		}
	    		
	    	}
	    	log.info("Target language selected is: "+currentlanguage);
	    }
	    

	}
	
	public static void languagechangehomepage(String targetlanguage, String page) throws InterruptedException {
		action=new Actions(driver);
		softassert=new SoftAssert();
		w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(hp.languagedropdownhomepage()));
		action.moveToElement(hp.languagedropdownhomepage()).click().build().perform();
		driverWait(5000);
		List<WebElement> activelangs=hp.activelanguageshomepage();        
		log.info("Number of active languages in "+page+" are: "+activelangs.size());
	    int p=activelangs.size();
	    if(p==tenantactivelanguages)
	    {
	    	log.info("Number of active languages are matching with AdminPanel active languages");
	    }
	    else
	    {
	    	softassert.fail("Number of active languages are not matching with AdminPanel active languages");
	    }
	    String selectedlanguagehomepage=hp.selectedlanguagehomepage().getText().trim();
	    log.info("Default selected language selected in "+page+" is: "+selectedlanguagehomepage);   
	    String currentlanguage="";
	    if(selectedlanguagehomepage.equalsIgnoreCase(targetlanguage))
	    {
	    	hp.selectedlanguagehomepage().click();
	    	log.info("The langauge is already selected");
	    }
	    else
	    {
	    	
	    	for(int i=0;i<activelangs.size();i++)
	    	{
	    		currentlanguage=activelangs.get(i).getText().trim();
	    		if(currentlanguage.equalsIgnoreCase(targetlanguage))
	    		{
	    			activelangs.get(i).click();	
	    			break;
	    		}
	    		
	    	}
	    	log.info("Target language selected is: "+currentlanguage);
	    }
	    

	}
	
	public static void languagechangepublicdashboardpage(String targetlanguage, String page) throws InterruptedException {
		action=new Actions(driver);
		softassert=new SoftAssert();
		pdp=new PublicDashboardPage(driver);
		w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(pdp.languagedropdownpublicpage()));
		action.moveToElement(pdp.languagedropdownpublicpage()).click().build().perform();
		driverWait(5000);
		List<WebElement> activelangs=pdp.activelanguagespublicpage();        
		log.info("Number of active languages in "+page+" are: "+activelangs.size());
	    int p=activelangs.size();
	    if(p==tenantactivelanguages)
	    {
	    	log.info("Number of active languages are matching with AdminPanel active languages");
	    }
	    else
	    {
	    	softassert.fail("Number of active languages are not matching with AdminPanel active languages");
	    }
	    String selectedlanguagehomepage=pdp.selectedlanguagepublicpage().getText().trim();
	    log.info("Default selected language in "+page+" is: "+selectedlanguagehomepage);   
	    String currentlanguage="";
	    if(selectedlanguagehomepage.equalsIgnoreCase(targetlanguage))
	    {
	    	pdp.selectedlanguagepublicpage().click();
	    	log.info("The langauge is already selected");
	    }
	    else
	    {
	    	
	    	for(int i=0;i<activelangs.size();i++)
	    	{
	    		currentlanguage=activelangs.get(i).getText().trim();
	    		if(currentlanguage.equalsIgnoreCase(targetlanguage))
	    		{
	    			activelangs.get(i).click();	
	    			break;
	    		}
	    		
	    	}
	    	log.info("Target language selected is: "+currentlanguage);
	    }
	    

	}
	
	public static void loginlabelCheck(String page) throws InterruptedException {
		driverWait(5000);
		softassert=new SoftAssert();
		String signintext=lp.SignInText().getText();
		if(signintext.equalsIgnoreCase("Prihlásiť sa"))
	    {
	    	log.info("Language changed successfully in "+page);
	    }
		else
		{
			softassert.fail("Language translation failed in "+page);
		}
	}
	
	public static void forgotpasswordlabelCheck(String page) throws InterruptedException {
		driverWait(8000);
		fp=new ForgotPasswordPage(driver);
		softassert=new SoftAssert();
		String forgotpasswordtext=fp.ForgotPasswordText().getText();
		if(forgotpasswordtext.equalsIgnoreCase("Zabudol si heslo"))
	    {
	    	log.info("Language changed successfully in "+page);
	    }
		else
		{
			softassert.fail("Language translation failed in "+page);
		}
	}
	
	public static void homepagelabelCheck(String page) throws InterruptedException {
		driverWait(8000);
		hp=new HomePage(driver);
		softassert=new SoftAssert();
		String settingstext=hp.Settingstext().getText().trim();
		if(settingstext.equalsIgnoreCase("nastavenie"))
	    {
	    	log.info("Language changed successfully in "+page);
	    }
		else
		{
			softassert.fail("Language translation failed in "+page);
		}
	}
	
	public static void publicDashboardPagelabelCheck(String page) throws InterruptedException {
		driverWait(8000);
		pdp=new PublicDashboardPage(driver);
		softassert=new SoftAssert();
		String dashboardtitletext=pdp.widgettitletextpublicpage().getText().trim();
		if(dashboardtitletext.equalsIgnoreCase("Grafy"))
	    {
	    	log.info("Language changed successfully in "+page);
	    }
		else
		{
			softassert.fail("Language translation failed in "+page);
		}
		driver.close();
	}
	
	public static void clickforgotPasswordLink() throws InterruptedException {
		lp=new LoginPage(driver);
		implicitWait();
		driverWait(3000);
		WebElement forgotpaasswordlink =lp.forgotpasswordlink();
		softassert=new SoftAssert();
		forgotpaasswordlink.click();
		driverWait(5000);
		if(driver.getTitle().equalsIgnoreCase("Quantela Application - Forgot Password"))
		{
			log.info("Navigated to forgot password page");
		}
		else
		{
			softassert.fail("Failed to naviagate to forgot password page");
		}
		
	}
	
	public static void forgotTosigninpage() throws InterruptedException {
		driverWait(3000);
		click(fp.gobackicon());
		implicitWait();
	}
	
	public static void createDashboard() throws InterruptedException {
		hp=new HomePage(driver);
		softassert=new SoftAssert();
		action=new Actions(driver);
		implicitWait();
		click(hp.searchdashboarddropdown());
		action.moveToElement(hp.newdashboardbutton()).click().build().perform();
		w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(hp.dashboardtitleinputfield()));
		action.moveToElement(hp.dashboardtitleinputfield()).click().sendKeys("Languagechange Dashboard").build().perform();
		click(hp.dashboardcategoryicon());
		driverWait(3000);
		action.moveToElement(hp.newcategoryinputfield()).click().sendKeys("shivaselenium").build().perform();
		driverWait(3000);
		click(hp.dashboardcreatebutton());
		
		w.until(ExpectedConditions.elementToBeClickable(hp.dashboardcreatetoaster()));
		WebElement toaster=hp.dashboardcreatetoaster();
		if(toaster.isDisplayed())
		{
			log.info("Dashboard created successfully");
		}
		else
		{
		   softassert.fail("Dashboard creation is failed");
		}	
		
	}
	
	public static void configureChartsWidget() throws InterruptedException {
		hp=new HomePage(driver);
		WidgetSettingsPage wsp=new WidgetSettingsPage(driver);
		action=new Actions(driver);
		driverWait(5000);
		click(hp.addwidgetbutton());
		action.moveToElement(hp.generalbutton()).click().build().perform();
		click(hp.chartsaddbutton());
		click(wsp.Datasettab());
		click(wsp.newdatasetbutton());
		driverWait(3000);
		action.moveToElement(wsp.datasourcefield()).click().build().perform();
		wsp.datasourcefield().sendKeys("shiva_multi");
		driverWait(3000);
		action.moveToElement(wsp.datasetname()).click().build().perform();
		driverWait(3000);
		w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(wsp.submitbutton()));
		wsp.submitbutton().click();
		driverWait(3000);	
		click(wsp.widgetcloseicon());
	}
	
	public static void configurepublicdashboard() throws InterruptedException  {
		implicitWait();
		hp=new HomePage(driver);
		action=new Actions(driver);
		softassert=new SoftAssert();
		click(hp.dashboardsettingsicon());
		driverWait(8000);
		action.moveToElement(hp.publictogglebutton()).click().build().perform();
		driverWait(5000);
		click(hp.dashboardupdatebutton());
		w.until(ExpectedConditions.elementToBeClickable(hp.dashboardUpdateToaster()));
		WebElement toaster=hp.dashboardUpdateToaster();
		if(toaster.isDisplayed())
		{
			log.info("Toaster dispayed for public dashboard creation");
		}
		else
		{
		   softassert.fail("Toaster not displayed for public dashboard creation");
		}		
		
	}
	
	public static void openPublicDashboardURL() throws InterruptedException, UnsupportedFlavorException, IOException{
		implicitWait();
		hp=new HomePage(driver);
		pdp=new PublicDashboardPage(driver);
		action=new Actions(driver);
		click(hp.dashboardsettingsicon());
		driverWait(5000);
		click(hp.copyURLicon());
		String mainwindow=driver.getWindowHandle();
		
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		String publicurl = (String) clipboard.getData(DataFlavor.stringFlavor);
		driverWait(3000);
		
		js=(JavascriptExecutor) driver;
		js.executeScript("window.open('"+publicurl+"')");
		driverWait(5000);
	
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			String publicwindow=itr.next();
			if(!mainwindow.equals(publicwindow))
			{
				driver.switchTo().window(publicwindow);
			}
		}
		
		implicitWait();
		action.moveToElement(pdp.widgettitletextpublicpage()).build().perform();
	}
	
	public static void closeMainwindow() throws InterruptedException {
		driver.switchTo().window(mainwindow);
		driverWait(5000);
		driver.close();
	}
	
}

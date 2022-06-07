package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Commonmethods {
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait w;
	public static Logger log=LogManager.getLogger(Commonmethods.class.getName());
	public static SoftAssert softassert;
	
	public static void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiva Prasad\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		log.info("Browser launched successfully");
	}

	public static void launchURL() {
		driver.get("https://atlantis-qa4-dashboard.quantela.com/#/login?client=gurugram.com");
		log.info("Navigated to the application URL");
	}
	
	public static void login() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.username().sendKeys("automationdemo@gurugram.com");
		lp.password().sendKeys("Test@123");
		driverWait(3000);
		lp.signInButton().click();
		log.info("Logged in to the application successfully");
	}
	
	public static void logout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		action=new Actions(driver);
		action.moveToElement(hp.userprofileicon()).click().build().perform();
		driverWait(5000);
		action.moveToElement(hp.signouttext()).click().build().perform();
		driverWait(5000);
		action.moveToElement(hp.confirmbutton()).click().build().perform();
		driverWait(5000);
		if(driver.getTitle().equalsIgnoreCase("Quantela Application - Login"))
		{
			log.info("User successfully logged out from the application");
		}
		else
		{
		 softassert.fail("Failed to log out from the application");
		}
		
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void pageRefresh() {
		driver.navigate().refresh();
		implicitWait();
	}
	
	
	public static void driverWait(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}

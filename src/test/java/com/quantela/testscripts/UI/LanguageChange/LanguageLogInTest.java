package com.quantela.testscripts.UI.LanguageChange;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import base.Commonmethods;
import featureMethods.LanguageImprovementMethods;

public class LanguageLogInTest extends LanguageImprovementMethods {

	@Test(priority=0)
	public static void tenantActiveLanguages() {

		try {
			initializeBrowser();
			launchURL();
			login();
			navigateToAppearance();
			navigateToAdvanced();
			activelanguagesAdminpanel();
			logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 1)
	public static void langaugedropdownDisplayLogin() {
		try {
			pageRefresh();
			languageDropdownPresence("loginpage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 2)
	public static void languageDropdownEnableLogin() {
		try {
			languageDropdownEnable("loginpage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 3)
	public static void languageChangeLogin() {
		try {
			languagechange("slovenský","Login page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 4)
	public static void labelCheckLogin() {
		try {
			loginlabelCheck("Loginpage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();

	}

}

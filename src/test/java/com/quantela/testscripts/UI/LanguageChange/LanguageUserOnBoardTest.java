package com.quantela.testscripts.UI.LanguageChange;

import org.testng.annotations.Test;

import featureMethods.LanguageImprovementMethods;

public class LanguageUserOnBoardTest extends LanguageImprovementMethods {
	
	@Test(priority=0)
	public static void applicationSignIn() {
		try {
			forgotTosigninpage();
			login();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}
	
	@Test(priority = 1)
	public static void langaugedropdownDisplayHomePage() {
		try {
			languageDropdownPresencehomepage("Homepage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 2)
	public static void languageDropdownEnableHomePage() {
		try {
			languageDropdownEnablehomepage("Homepage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}
	
	@Test(priority=3)
	public static void languageChangeHomePage() {
		try {
			languagechangehomepage("slovenský", "HomePage");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}
	
	@Test(priority=4)
	public static void labelCheckHomePage() {
		try{
			homepagelabelCheck("Homepage");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}

}

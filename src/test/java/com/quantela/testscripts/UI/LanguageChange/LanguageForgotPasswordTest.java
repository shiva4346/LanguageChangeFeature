package com.quantela.testscripts.UI.LanguageChange;

import org.testng.annotations.Test;

import base.Commonmethods;
import featureMethods.LanguageImprovementMethods;

public class LanguageForgotPasswordTest extends LanguageImprovementMethods {

	@Test(priority=0)
	public static void forgotPasswordLinkClick() {
		try {
			clickforgotPasswordLink();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority=1)
	public static void langaugedropdownDisplayForgotPassword() {
		try {
			languageDropdownPresence("Forgotpassword page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority=2)
	public static void languageDropdownEnableForgotPassword() {
		try {
			languageDropdownEnable("Forgotpassword page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority=3)
	public static void languageChangeForgotPassword() {
		try {
			languagechange("slovenský","Forgotpassword page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority=4)
	public static void labelCheckForgotPassword() {
		try{
			forgotpasswordlabelCheck("Forgotpassword page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		softassert.assertAll();
	}

}

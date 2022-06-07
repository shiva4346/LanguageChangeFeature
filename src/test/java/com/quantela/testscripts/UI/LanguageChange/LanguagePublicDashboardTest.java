package com.quantela.testscripts.UI.LanguageChange;

import org.testng.annotations.Test;

import featureMethods.LanguageImprovementMethods;

public class LanguagePublicDashboardTest  extends LanguageImprovementMethods{
	
	@Test(priority=0)
	public static void dashboardCreation() {
		try {
			createDashboard();		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public static void publicDashboardNavigation() {
		try {
			configureChartsWidget();
			configurepublicdashboard();
			openPublicDashboardURL();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	@Test(priority = 2)
	public static void langaugedropdownDisplayPublic() {
		try {
			languageDropdownPresencepublicdashboardpage("PublicDashboard page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 3)
	public static void languageDropdownEnablePublic() {
		try {
			languageDropdownEnablepublicdashboardpage("PublicDashboard page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 4)
	public static void languageChangePublic() {
		try {
			languagechangepublicdashboardpage("slovenský","PublicDashboard page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();
	}

	@Test(priority = 5)
	public static void labelCheckPublic() {
		try {
			publicDashboardPagelabelCheck("PublicDashboard page");
		} catch (Exception e) {
			e.printStackTrace();
		}
		softassert.assertAll();

	}
	
	@Test(priority=6)
	public static void browserclose() {
		try {
			closeMainwindow();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreporting {
	public static ExtentReports report;
	
	public static ExtentReports reporting() {
	    report = new ExtentReports();
		String path=System.getProperty("user.dir")+"//reports//Automationreport.html";	
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Quantela Automation Report");
		reporter.config().setDocumentTitle("UI Automation Report");
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "ShivaPrasad");
		report.setSystemInfo("Browser Version", "98");
		report.setSystemInfo("Build Version", "V2.3.3");
		return report;
	}

}

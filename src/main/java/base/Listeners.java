package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends Extentreporting implements ITestListener {

  
   ExtentReports extent = Extentreporting.reporting();
   ExtentTest test;
   
	@Override
	public void onTestStart(ITestResult result) {
		 test=report.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName()+" is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+" is failed");
		test.fail(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName()+" is Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution is started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		System.out.println("Execution is finished");
		
	}

}

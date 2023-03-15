package Practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test is started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TC is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

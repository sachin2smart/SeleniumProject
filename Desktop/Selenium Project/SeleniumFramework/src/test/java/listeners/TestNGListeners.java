package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("***************Test started "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("***************Test is successfull "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("***************Test failed "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("***************Test skipped "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestFinish(ITestResult result) {
		System.out.println("***************Test completed "+result.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
	
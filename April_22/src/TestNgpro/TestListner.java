package TestNgpro;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListner implements ITestListener {
  @Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method passed"+result.getName());
			}
	

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Method failded"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Method Failed Within certain Success Percentage"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("method failed due to time-"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on star method started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onfinish method finished");
	}


}

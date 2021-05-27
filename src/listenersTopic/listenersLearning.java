package listenersTopic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersLearning implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test is started from the listener code - onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The test is success from the listener code - onTestSuccess");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test failed from the listener code - onTestFailure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test is skipped from the listener code - onTestSkipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The listener code - onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The listener code - onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The listener code - onFinish");
		
	}

}

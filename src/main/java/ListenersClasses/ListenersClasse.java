package ListenersClasses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClasse implements ITestListener {

	public void onTestStart(ITestResult result) {
	    System.out.println(result.getName()+ "Test Started");
	  }

	  public void onTestSuccess(ITestResult result) {
		    System.out.println(result.getName()+ "Test Pass");	
		    }

	  public void onTestFailure(ITestResult result) {
	   	    System.out.println(result.getName()+ "Test Failed");
	  }

	  public void onTestSkipped(ITestResult result) {
		    System.out.println(result.getName()+ "Test Skipped");	
		    }

	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    System.out.println(result.getName()+ "Test Success Percentage");
	  }

	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
		   // System.out.println(result.getName()+ "Test Started");

	  }

	  public void onStart(ITestContext context) {
		    System.out.println(context.getName()+ "Test OnStart");
	  }

	  public void onFinish(ITestContext context) {
		    System.out.println(context.getName()+ "Test onFinish");
	  }	
}
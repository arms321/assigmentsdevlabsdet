package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.assertthat.selenium_shutterbug.core.Shutterbug;


public class ListenerExercise11 implements ITestListener {

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
	
	}

	public void onTestStart(ITestResult result) {
	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
		Object currentClass = result.getInstance();
		WebDriver driver = ((selenium.assignments.SeleniumExercise10to12) currentClass).driver;
		Shutterbug.shootPage(driver).withName("Exer11St").save();
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		Object currentClass = result.getInstance();
		WebDriver driver = ((selenium.assignments.SeleniumExercise10to12) currentClass).driver;
		Shutterbug.shootPage(driver).withName("Exer11St").save();
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

}

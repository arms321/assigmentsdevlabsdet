package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenerExercise12 implements IRetryAnalyzer{

	private int retryCount = 1;
	private int maxRetryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(retryCount <= maxRetryCount) {
			System.out.println("Retry");
			retryCount++;
			return true;
		}
		
		return false;
	}

}

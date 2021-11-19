package Selenium_Assignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TC12Retryanalyzer implements IRetryAnalyzer {
	
		
		private int retryCount;
		private static final int maxRetryCount=3;

		
		public boolean retry(ITestResult result) {
			
		    if (retryCount < maxRetryCount) {
		      retryCount++;
		      return true;
		    }
			    return false;
		}

}

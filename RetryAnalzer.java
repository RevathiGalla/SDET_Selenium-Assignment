package listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalzer implements IRetryAnalyzer{
	
	private int retryCount;
	
    private static final int maxretrycount=3;
    
    public boolean retry(ITestResult result) {
    	
    	if(retryCount <maxretrycount) {
    		retryCount++;
    		return true;
    
    	}
    	return false;
    	
    }

}

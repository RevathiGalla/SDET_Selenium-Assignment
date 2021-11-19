package Selenium_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC7Testpriority {

	 @Test(priority=2)
	   public void ABC() {
			  System.out.println("Assignment7-priotity 1set");
	  }
	  @Test (priority=1)
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com");
			System.out.println(driver.getCurrentUrl());	
			System.out.println("launchbrowser");
			System.out.println(driver.getTitle());
	  }
}

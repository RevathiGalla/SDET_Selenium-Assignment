package Selenium_Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.orangeHrmpages;

public class TC11implementsTestlistner extends Basictest {

	orangeHrmpages OH;
	
	@BeforeMethod
	public void text1()throws InterruptedException{
		OH=new orangeHrmpages();
		
	}
	
	@Test(priority=1)
	 public void LaunchUrl ()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getTitle());	
		
	}
	
	@Test(priority=2, retryAnalyzer=listner .RetryAnalzer.class)
	
	public void Testlistermethod1 ()throws InterruptedException, IOException{
		

	String DBHeader=OH.getDashBoardConfirmtionUsingHeaderText();
	boolean result=DBHeader.equalsIgnoreCase("Useris on Dashboard");

	
	}
	
	
	
		

}

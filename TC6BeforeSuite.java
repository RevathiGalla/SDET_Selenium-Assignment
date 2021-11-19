package Selenium_Assignments;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TC6BeforeSuite {

	@BeforeSuite
	public void launchurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("launchbrowser");
		System.out.println(driver.getTitle());
	}

	@Test
	public void URLTest() {
		System.out.println("OrangeHRM");

	}

}

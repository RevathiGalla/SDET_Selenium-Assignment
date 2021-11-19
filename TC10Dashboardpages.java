package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.orangeHrmpages;

public class TC10Dashboardpages {
	orangeHrmpages OH;

	@BeforeMethod
	public void loadpages() {
		OH = new orangeHrmpages();
		System.out.println("Dashboardvalidated in Test");
	}

	@Test
	public void DashBaord() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("launchbrowser");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		OH.getDashBoardUsingTabName();
		String DBHeader = OH.getDashBoardConfirmtionUsingHeaderText();
		Assert.assertEquals("DashBoard", DBHeader);
		System.out.println(" Validated the DB header tab:=" + DBHeader);

	}

}

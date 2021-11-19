package Selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.orangeHrmpages;

public class TC8Validatetabs extends Basictest {
	orangeHrmpages OH;

	@BeforeMethod
	public void loadpages() {
		OH = new orangeHrmpages();

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println("launchbrowser");
		System.out.println(driver.getTitle());

	}

	@Test(priority = 2)
	public void ValidatingAdminTab() throws InterruptedException {
		OH.GetAdminTab();
		Thread.sleep(3000);
		OH.GetAdminTabConfirmation();
		String TabName = OH.GetAdminTabConfirmation();
		Assert.assertEquals("Admin", TabName);
		Reporter.log(" User is Now in Tab =  " + TabName, true);

	}

	@Test(priority = 3)
	public void PIMTab() throws InterruptedException {
		OH.GetPImTab();
		Thread.sleep(1000);
		String menu1 = OH.GetPIMTabConfirmation();

		Assert.assertEquals("PIM", menu1);
		Reporter.log(" User is on Tab =  " + menu1, true);

	}

	@Test(priority = 4)
	public void LeaveTab() throws InterruptedException {

		OH.GetLeaveTab();
		Thread.sleep(2000);
		String menu2 = OH.GetLeaveTabConfirmation();

		Assert.assertEquals("Leave", menu2);
		Reporter.log(" User is on Tab =  " + menu2, true);

	}

	@Test(priority = 5)
	public void Directory() throws InterruptedException {

		OH.GetDirectoryTab();
		Thread.sleep(2000);
		String menu3 = OH.GetDirectoryTabConfirmation();

		Assert.assertEquals("Directory", menu3);
		Reporter.log(" User is on Tab =  " + menu3, true);

	}

	@Test(priority = 6)
	public void Miantenance() throws InterruptedException {

		OH.GetMaintenanceTab();
		Thread.sleep(2000);
		String menu4 = OH.GetMaintenanceTabConfirmation();

		Assert.assertEquals("Maintenance", menu4);
		Reporter.log(" User is on Tab =  " + menu4, true);
	}
}

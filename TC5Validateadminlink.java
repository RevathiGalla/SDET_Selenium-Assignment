package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC5Validateadminlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		

		driver.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]/b").click();
		String admin = driver.findElementByXPath("//*[@id=\"menu_admin_viewAdminModule\"]/b").getText();
		System.out.println(admin);
		String abc = "Admin";
		System.out.println(abc);
		Assert.assertEquals(admin, abc);
		System.out.println("validate Admin");


		driver.findElementByXPath("//*[@id=\"menu_admin_UserManagement\"]").click();
		String usermanagement = driver.findElementByXPath("//*[@id=\"menu_admin_UserManagement\"]").getText();
		System.out.println(usermanagement);
		String abc1 = "UserManagement";
		System.out.println(abc1);
		Assert.assertEquals(usermanagement, abc1);
		System.out.println("validate usermanagement");

		driver.findElementByXPath("//*[@id=\"menu_admin_Job\"]").click();
		String Job = driver.findElementByXPath("//*[@id=\"menu_admin_Job\"]").getText();
		System.out.println(Job);
		String abc2 = "Job";
		System.out.println(abc2);
		Assert.assertEquals(Job, abc2);
		System.out.println("validate Job");

		driver.findElementByXPath("//*[@id=\"menu_admin_Organization\"]").click();
		String Organization = driver.findElementByXPath("//*[@id=\"menu_admin_Organization\"]").getText();
		System.out.println(Organization);
		String abc3 = "Organization";
		System.out.println(abc3);
		Assert.assertEquals(Organization, abc3);
		System.out.println("validate Organization");

		driver.findElementByXPath("//*[@id=\"menu_admin_Qualifications\"]").click();
		String Qualifications = driver.findElementByXPath("//*[@id=\"menu_admin_Qualifications\"]").getText();
		System.out.println(Qualifications);
		String abc4 = "Qualifications";
		System.out.println(abc4);
		Assert.assertEquals(Qualifications, abc4);
		System.out.println("validate Qualifications");
		
	
		driver.close();

	}

}

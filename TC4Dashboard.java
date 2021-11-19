package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC4Dashboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		String dashboard ="//*[@id=\"content\"]/div/div[1]/h1";
		String ab=driver.findElement(By.xpath(dashboard)).getText();
		Assert.assertEquals(ab, dashboard);
		System.out.println(ab);
		System.out.println("Dashboard is validated");
		driver.close();
	}

}

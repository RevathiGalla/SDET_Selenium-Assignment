package Selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1OpenURL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}

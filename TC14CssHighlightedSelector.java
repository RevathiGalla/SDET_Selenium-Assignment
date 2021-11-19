package Selenium_Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.orangeHrmpages;

public class TC14CssHighlightedSelector  {

	orangeHrmpages OH;

	@BeforeMethod
	public void Method1() {

		OH = new orangeHrmpages();

	}

	@Test
	public void highlighterElement() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.getTitle());

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		WebElement PIM = driver.findElement(By.cssSelector("#menu_pim_viewPimModule"));
		highLighterMethod(driver, PIM);
		WebElement time = driver.findElement(By.cssSelector("#menu_time_viewTimeModule"));
		highLighterMethod(driver, time);
		WebElement maintanance = driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee"));
		highLighterMethod(driver, maintanance);
		WebElement AssignLeave = driver.findElement(By.cssSelector(
				"div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tr:nth-child(1) td:nth-child(1) div.quickLaunge a:nth-child(1) > img:nth-child(1)"));
		highLighterMethod(driver, AssignLeave);
		WebElement Timesheet = driver.findElement(By.cssSelector(
				"div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tbody:nth-child(1) tr:nth-child(1) td:nth-child(6) > div.quickLaunge"));
		highLighterMethod(driver, Timesheet);
		
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File Src=srcShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("image.png"));

	}

	public void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
	}

}

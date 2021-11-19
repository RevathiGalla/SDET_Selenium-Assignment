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


public class TC15XpathhightlightedSelector {
	
	@BeforeMethod
	public void method()
	{
		System.out.println("Allxpath need to returned");
	}
@Test
public void highlighterElement() throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	System.out.println(driver.getTitle());
		WebElement MarketPlace = driver.findElement(By.xpath("//input[@id='MP_link']"));
	highLighterMethod(driver,MarketPlace);
	WebElement Welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
	highLighterMethod(driver,Welcome);
	WebElement Admin  = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
	highLighterMethod(driver,Admin);
	WebElement Leave  = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]"));
	highLighterMethod(driver,Leave);

	TakesScreenshot srcShot = ((TakesScreenshot)driver);
	File Src=srcShot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src, new File("image.png"));
	
}
public void highLighterMethod(WebDriver driver, WebElement element){
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
	
	
}
}
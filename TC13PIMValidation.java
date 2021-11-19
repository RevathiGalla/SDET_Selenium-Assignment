package Selenium_Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.orangeHrmpages;

public class TC13PIMValidation {
	orangeHrmpages OH;

@BeforeMethod
public void method() {
	OH= new orangeHrmpages();
}	
	
@Test
public void PIMmenu()throws InterruptedException,IOException{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com");
System.out.println(driver.getTitle());	

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();

OH.GetPImTab();
String PIMmenu=OH.GetPIMTabConfirmation();
Assert.assertEquals("PIMTAB", PIMmenu);
Reporter.log(PIMmenu, true);

WebElement FirstName=driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
FirstName.sendKeys("Linda Anderson");

Thread.sleep(1000);
String  Attribute=FirstName.getAttribute("value");
System.out.println("Entered Value"+Attribute);

 
TakesScreenshot srcShot = ((TakesScreenshot)driver);
File Src=srcShot.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Src, new File("Table.png"));

	
}

	
}
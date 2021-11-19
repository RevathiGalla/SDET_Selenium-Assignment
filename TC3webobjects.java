package Selenium_Assignments;


import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.orangeHrmpages;


public class TC3webobjects {

	
		orangeHrmpages OH;

		@Test
		
		public void loginPage() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gallare\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			OH = new orangeHrmpages();
			driver.get("https://opensource-demo.orangehrmlive.com");


			List<WebElement> CountForImages =OH.getAllImagesXpath();
			int AllImagesXpath = CountForImages.size();
			Assert.assertTrue(AllImagesXpath == 5);
			Reporter.log("Total Number of Images on Login Page using xpath are " + AllImagesXpath, true);

			List<WebElement> CountForImages1 = OH.getAllImagesCss();
			int AllImagesCss = CountForImages1.size();
			Assert.assertTrue(AllImagesXpath == 5);
			Reporter.log("Total Number of Images on Login Page using css are " + AllImagesCss, true);

			List<WebElement> Count = OH.getAllLinksXpath();
			int AllLinksXpath = Count.size();
			Assert.assertTrue(AllLinksXpath == 6);
			Reporter.log("Total Number of Links on Login Page using xpath are " + AllLinksXpath, true);

			List<WebElement> Count1 = OH.getAllLinksXpath();
			int AllLinksCss = Count1.size();
			Assert.assertTrue(AllLinksCss == 6);
			Reporter.log("Total Number of Links on Login Page using css are " + AllLinksCss, true);

			List<WebElement> CountTextBox = OH.getAllTextBoxesXpath();
			int AllTextBoxXpath = CountTextBox.size();
			Assert.assertTrue(AllTextBoxXpath == 2);
			Reporter.log("Total Number of TextBoxes on Login Page using xpath are " + AllTextBoxXpath, true);

			List<WebElement> CountTextBox1 = OH.getAllTextBoxesCss();
			int AllTextBoxCss = CountTextBox1.size();
			Assert.assertTrue(AllTextBoxCss == 2);
			Reporter.log("Total Number of TextBoxes on Login Page using css are " + AllTextBoxCss, true);

		}
		
		
		
		
		

	

}

package SDET_cucumber;



import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.orangeHrmpages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;



public class Stepdefinition {
	WebDriver driver;
	orangeHrmpages OH;
	
	
	@Given("^When I am in OrangeHRP Application $")
    public void when_i_am_in_orangehrp_application() throws Throwable {
        throw new PendingException();
    }

    @When("^Dashboard page is available $")
    public void dashboard_page_is_available() throws Throwable {
        throw new PendingException();
    }

    @Then("^Click on Job $")
    public void login_to_application() throws Throwable {
        throw new PendingException();
    }

    @And("^validate text – Job Title$")
    public void click_on_admin_menu() throws Throwable {
        throw new PendingException();
  }

}

package SDET_cucumber;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.orangeHrmpages;

public class cucumber {
	WebDriver driver;
	orangeHrmpages OH;
	
	@Given("^When I am in OrangeHRP Application $")
    public void when_i_am_in_orangehrp_application() throws Throwable {
        throw new PendingException();
    }

    @When("^click on Admin Link $")
    public void dashboard_page_is_available() throws Throwable {
        throw new PendingException();
    }

    @Then("^Login to Application $")
    public void login_to_application() throws Throwable {
        throw new PendingException();
    }

    @And("^ click on Admin menu$")
    public void click_on_admin_menu() throws Throwable {
        throw new PendingException();
  }
}

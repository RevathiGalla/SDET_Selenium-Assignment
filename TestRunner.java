package SDET_cucumber;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		
		features = "src/test/java/features" ,
		glue = "stepdefinition" )
		//dryRun = true,
		//strict = false,
		//monochrome = true
		//format = {"pretty", "html:test-output"},
		//tags = {"@SmokeTest , @RegressionalTest" }
public class TestRunner {

}

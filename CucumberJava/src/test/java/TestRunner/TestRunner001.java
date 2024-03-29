package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/savedetails.feature",
		glue={"StepDefinitions"}, 
		monochrome = true, 
		stepNotifications = true,
//		strict = true,
		plugin = {"pretty",
		"html:target/HtmlReports", 
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"})

public class TestRunner001 {

}

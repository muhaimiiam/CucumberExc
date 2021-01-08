package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
//	@Given("Browser is open")
//	public void browser_is_open() {
//	    System.out.println("Inside step: Browser is open");
//	    System.setProperty("webdriver.chrome.driver", "/Users/muhaimi_271/eclipse-workspace/CucumberJava/src/test/resources/driver/chromedriver");
//	    
//	    driver=new ChromeDriver();
//	    
//	}
//
//	@And("User is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("User enter a text in search box")
//	public void user_enter_a_text_in_search_box() {
//		driver.findElement(By.name("q")).sendKeys("Muhaimi");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("User is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside step: Search result");
//		driver.close();
//		driver.quit();
//	}

}

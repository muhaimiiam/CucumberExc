package StepDefinitions;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo {
	
	WebDriver driver = null;
	
	LoginPage login;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Browser is opened");
		System.setProperty("webdriver.chrome.driver", "/Users/muhaimi/eclipse-workspace/CucumberJava/src/test/resources/driver/chromedriver");
	    
		driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(1000);
	}

	@When("user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
//	    driver.findElement(By.id("name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
		
		login=new LoginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
	    
	    Thread.sleep(2000);
	}
	
	@And("user click on login")
	public void user_click_on_login() {
//		driver.findElement(By.id("login")).click();
		
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		driver.findElement(By.id("logout")).click();
		
		login.clickLogout();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}

}

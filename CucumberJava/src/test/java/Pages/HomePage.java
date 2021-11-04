package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
//	By dp_country = By.id("country");
	By txt_address = By.id("address");
	By txt_email = By.id("email");
	By txt_phone = By.id("phone");
	By btn_save = By.id("save");
	By btn_logout = By.id("logout");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void selectCountry(String country) {
		Select dp_country = new Select(driver.findElement(By.id("country")));
		dp_country.selectByVisibleText(country);

	}
	
	public void enterAddress(String address) {
		driver.findElement(txt_address).sendKeys(address);

	}
	
	public void enterEmail(String email) {
		driver.findElement(txt_email).sendKeys(email);

	}
	
	public void enterPhone(String phone) {
		driver.findElement(txt_phone).sendKeys(phone);
	}
	
	public void clickSave() {
		driver.findElement(btn_save).click();

	}
	
	public void clickLogout() {
		driver.findElement(btn_logout).click();

	}
	
	
	

}

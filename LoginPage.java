package pages;

import org.fb.selenium.By;
import org.fb.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
          this.driver = driver;
	}
	
	By uName = By.id("userName");
	
	By pswd = By.id("password");
	
	By loginBtn = By.id("login");
	
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}

	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
package pages;
 
import org.fb.selenium.By;
import org.fb.selenium.WebDriver;
 
public class HomePage {
 
 WebDriver driver;
 
 public HomePage(WebDriver driver) {
 this.driver=driver;
 }
 
 By LoginBtn = By.id("login");
 
 public void clickLogin() {
 driver.findElement(LoginBtn).click();
 }
}
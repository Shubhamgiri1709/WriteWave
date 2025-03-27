package pageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
WebDriver driver;
	
	//constructor
   public Registration(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locator
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement Registration;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Register;
	
	
	
   //valid username password
	public void registrationbtn() {
		Registration.click();
	}
	public void Username(String username) {
		Username.click();
		Username.sendKeys("Admin");
	}
	
	public void Password(String password) {
		Password.click();
		Password.sendKeys("admin123");
	}
	
	public void btnRegister() {
		Register.click();
	}
	
	
	public String handleAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        return alertMessage;
    }
	
	 //empty username password
		public void registrationbtn1() {
			Registration.click();
		}
		public void Username1(String username) {
			Username.click();
			Username.sendKeys("");
		}
		
		public void Password1(String password) {
			Password.click();
			Password.sendKeys("");
		}
		
		public void btnRegister1() {
			Register.click();
		}
		
		
		public String handleAlert1() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        String alertMessage = alert.getText();
	        alert.accept();
	        return alertMessage;
	    }
		
	
}

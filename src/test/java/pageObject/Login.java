package pageObject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

WebDriver driver;
	
	//constructor
   public Login(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locator
	@FindBy(linkText="Login")
	WebElement Login;
	
	@FindBy(xpath="(//input[@placeholder='username'])[1]")
	WebElement Username;
	
	@FindBy(xpath="//input[@placeholder=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath="//button[@class=\"login-btn\"]")
	WebElement Loginbtn;
	
	
	
   //valid username password
	public void Loginbtn() {
		Login.click();
	}
	public void Username(String username) {
		Username.click();
		Username.sendKeys("Admin");
	}
	
	public void Password(String password) {
		Password.click();
		Password.sendKeys("admin123");
	}
	
	public void btnLogin() {
		Loginbtn.click();
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
		public void Loginbtn1() {
			Login.click();
		}
		public void Username1(String username) {
			Username.click();
			Username.sendKeys("");
		}
		
		public void Password1(String password) {
			Password.click();
			Password.sendKeys("");
		}
		
		public void btnLogin1() {
			Loginbtn.click();
		}
		
		
		public String handleAlert1() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        String alertMessage = alert.getText();
	        alert.accept();
	        return alertMessage;
	    }
		
		
		 //invalid username password
		public void Loginbtn2() {
			Login.click();
		}
		public void Username2(String username) {
			Username.click();
			Username.sendKeys("samir");
		}
		
		public void Password2(String password) {
			Password.click();
			Password.sendKeys("12345");
		}
		
		public void btnLogin2() {
			Loginbtn.click();
		}
		
		
		public String handleAlert2() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.alertIsPresent());
	        Alert alert = driver.switchTo().alert();
	        String alertMessage = alert.getText();
	        alert.accept();
	        return alertMessage;
	    }
		
}

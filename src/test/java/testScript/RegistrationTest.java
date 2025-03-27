package testScript;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.Registration;



public class RegistrationTest extends BaseClass {

	@Test(priority = 1)
	public void RegistrationwithvalidCandentials() {
		
		Registration page = new Registration(driver);
		
		page.registrationbtn();
		page.Username("Admin");
		page.Password("admin123");
		page.btnRegister();
		
		// Handle alert and print message
        String alertText = page.handleAlert();
        System.out.println("Alert Message: " + alertText);
		
	}
	
	@Test(priority = 2)
	public void RegistrationwithemptyCandentials() {
		
		Registration page = new Registration(driver);
		
		page.registrationbtn1();
		page.Username1("");
		page.Password1("");
		page.btnRegister1();
		
		// Handle alert and print message
        String alertText = page.handleAlert1();
        System.out.println("Alert Message: " + alertText);
		
	}
	
}

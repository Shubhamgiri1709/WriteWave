package testScript;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.Login;
import pageObject.Registration;

public class LoginTest extends BaseClass {
	@Test(priority = 1)
	public void LoginwithvalidCandentials() {
		
		Login page = new Login(driver);
		
		page.Loginbtn();
		page.Username("Admin");
		page.Password("admin123");
		page.btnLogin();
		
		// Handle alert and print message
        String alertText = page.handleAlert();
        System.out.println("Alert Message: " + alertText);
		
	}
	
	@Test(priority = 2)
	public void LoginwithemptyCandentials() {
		
		Login page = new Login(driver);
		
		page.Loginbtn1();
		page.Username1("");
		page.Password1("");
		page.btnLogin1();
		
		// Handle alert and print message
        String alertText1 = page.handleAlert1();
        System.out.println("Alert Message: " + alertText1);
		
	}
	
	@Test(priority = 3)
	public void LoginwithinvalidCandentials() {
		
		Login page = new Login(driver);
		
		page.Loginbtn2();
		page.Username2("samir");
		page.Password2("12345");
		page.btnLogin2();
		
		// Handle alert and print message
        String alertText2 = page.handleAlert2();
        System.out.println("Alert Message: " + alertText2);
		
	}
}

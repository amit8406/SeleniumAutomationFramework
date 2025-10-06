package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testLoginValid() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
		System.out.println("Page Title is "+driver.getTitle());
		
	}
	
}

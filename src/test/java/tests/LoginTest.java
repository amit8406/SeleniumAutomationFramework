package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import org.testng.Assert;
import base.BaseTest;
import pages.LoginPage;
import utils.ExtentReportManager;
import utils.Log;


public class LoginTest extends BaseTest{
	
	@Test
	public void testLoginValid() {
		Log.info("Starting with Login with Credentials.");
		test = ExtentReportManager.createTest("Login Test");
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigated to Login Page");
		
		try
		{
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
		test.info("Entered credentials");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		test.info("Page Title is observed as expected!");
		}
		catch(AssertionError | Exception e) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "LoginFailure");

            test.fail("Test failed: " + e.getMessage(),
                MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            throw e;
		}
		System.out.println("Page Title is "+driver.getTitle());
		test.info("Login functionality is passed.");
		
	}
	
	
	@Test
	public void testResetPassword()
	{
		Log.info("Starting with ResetPassword");
		test = ExtentReportManager.createTest("ResetPasswordTest");
		LoginPage loginPage = new LoginPage(driver);
		test.info("Navigated to Login Page");
		try
		{
		loginPage.clickResetPassword();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		test.info("Page Title is observed as expected for Forgot Password Screen!");
		}
		catch(AssertionError | Exception e) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "ResetPasswordFailure");

            test.fail("Test failed: " + e.getMessage(),
                MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            throw e;
		}
		System.out.println("Page Title is "+driver.getTitle());
		test.info("Reset Password functionality is passed.");
	}
	
}

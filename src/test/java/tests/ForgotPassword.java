package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import base.BaseTest;
import pages.ForgotPasswordPage;
import utils.ExtentReportManager;


public class ForgotPassword extends BaseTest{
	
	
	@Test
	public void forgotPassLinkTest()
	{
		test = ExtentReportManager.createTest("ResetPasswordTest");
		ForgotPasswordPage forgotPass = new ForgotPasswordPage(driver);
		test.info("Forgot Password Link is Clicked!");
		try
		{		
		Assert.assertEquals(driver.getTitle(), "OrangeHRMsd2");
		test.info("Page Title is observed as expected!");
		}
		catch(AssertionError | Exception e) {
			String screenshotPath = ExtentReportManager.captureScreenshot(driver, "LoginFailure");

            test.fail("Test failed: " + e.getMessage(),
                MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
            throw e;
		}
	}

}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;



public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		Log.info("WebDriver started....");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Navigating to URL....");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void TearDown() {
		if(driver!=null) {
			Log.info("Closing Browser........");
			driver.quit();
		}
	}
}

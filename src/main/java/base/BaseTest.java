package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterMethod
	public void TearDown() {
		if(driver!=null) {
		//	driver.quit();
		}
	}
}

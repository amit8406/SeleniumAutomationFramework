package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {
	
	private WebDriver driver;
    private WebDriverWait wait;
    private By forgotPassLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    public ForgotPasswordPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void forgotPassLinkClick() {
        WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassLink));
        //usernameField.clear();
        link.click();
    }
}

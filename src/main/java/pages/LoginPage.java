package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	
	private By userId = By.id("user-name");
	private By password = By.id("password");
	private By logInButton2 = By.id("login-button");
	
	
	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
        PageFactory.initElements(driver, this);
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	/*
	 * public void clickOnuserFigure() { driver.findElement(personfigure).click(); }
	 * 
	 * public void clickOnLogin1() { driver.findElement(logInButton1).click(); }
	 */

	public void enterUserName(String username) {
		driver.findElement(userId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin2() {
		driver.findElement(logInButton2).click();
	}

	

}

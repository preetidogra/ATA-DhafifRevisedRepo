package stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class CheckTextStepDefinition {
	
	//WebDriver driver = null;
	private static String title;

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

@Given("Browser is opened")
public void browser_is_opened() {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\ATA-main\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
	DriverFactory.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	DriverFactory.getDriver().manage().window().maximize();
}

@And("User is on the homepage")
public void user_is_on_the_homepage() {
	System.out.println("user is on saucedemo homepage");
	DriverFactory.getDriver().navigate().to("https://www.saucedemo.com");
}

@When("User enters username and password")
public void user_enters_username_and_password() {
	System.out.println("user enters login details");
	DriverFactory.getDriver().findElement(By.xpath(" (//input[@id='user-name'])[1]")).sendKeys("standard_user");
	DriverFactory.getDriver().findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("secret_sauce");
}

@When("User clicks on Login button")
public void user_clicks_on_login_button() {
	DriverFactory.getDriver().findElement(By.id("login-button")).sendKeys(Keys.ENTER);
}

@Then("Login is successful")
public void login_is_successful() {
    System.out.println("Login Sucess");
}

//@Then("text is visible")
//public void page_title_is_visible() {
	//System.out.println("User is on the menu page");
	//DriverFactory.getDriver().getPageSource().contains("PRODUCTS");
//}

}

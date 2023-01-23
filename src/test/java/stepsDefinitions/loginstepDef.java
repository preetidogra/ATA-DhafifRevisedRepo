package stepsDefinitions;
import pages.LoginPage;
import org.junit.Assert;


import factory.DriverFactory;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class loginstepDef {
	private static String title;

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		DriverFactory.getDriver()
		.get("https://www.saucedemo.com/inventory.html");
	}

		
	

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button2")
	public void user_clicks_on_login_button2() {
		// Write code here that turns the phrase above into concrete actions
		loginPage.clickOnLogin2();	}
	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		// Write code here that turns the phrase above into concrete actions
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

}

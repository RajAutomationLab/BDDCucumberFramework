package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginStep {

	WebDriver driver;
	private LoginPage loginPage; 
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	
	   driver = DriverManager.getDriver();
	   loginPage = new LoginPage(driver);
	   
	   
	}

	@When("User enters {string} into email field")
	public void user_enters_into_email_field(String emailId) {
	   loginPage.enterEmail(emailId);
	}

	@When("User enters {string} into password field")
	public void user_enters_into_password_field(String pwd) {
	    loginPage.enterPassword(pwd);
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
	    loginPage.clickOnLoginButton();
	}

	@Then("User should be successfully logged In")
	public void user_should_be_successfully_logged_in() {
	    Assert.assertTrue(loginPage.getDisplayStatusOfDashboardPageTitle());
	    
	}

	@Then("User should be successfully logged out")
	public void user_should_be_successfully_logged_out() {
	    Assert.assertTrue(loginPage.getDisplayStatusOfLoginPageTitle());
	}

	@When("User clicks on Logout Button")
	public void user_clicks_on_logout_button() {
	  loginPage.clickOnLogoutLink();
	}

}

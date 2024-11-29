package stepDefination;

import org.junit.Assert;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class loginSteps 
{
	LoginPage login;
	HomePage homePage;
	
	@Given("User can access the application")
	public void user_can_access_the_application() 
	{
	    login=new LoginPage(BrowserFactory.getDriver());
	    homePage=new HomePage(BrowserFactory.getDriver());
	}

	@When("User enters {string} in email field")
	public void user_enters_in_email_field(String email) 
	{
	    login.typeUserName(email);
	}

	@When("User enters {string} in password field")
	public void user_enters_in_password_field(String password) 
	{
	    login.typePassword(password);
	}

	@When("User can click on login")
	public void user_can_click_on_login() 
	{
	    login.clickSignIn();
	}

	@Then("User can verify manage filed on home page")
	public void user_can_verify_manage_filed_on_home_page() 
	{
		Assert.assertTrue(homePage.isManageDisplayed());
	}

}

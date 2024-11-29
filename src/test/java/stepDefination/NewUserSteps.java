package stepDefination;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.NewUserPage;

public class NewUserSteps 
{
	LoginPage loginPage;
	NewUserPage newUser;
	
	@Given("user was able to access the application")
	public void user_was_able_to_access_the_application() 
	{
		loginPage=new LoginPage(BrowserFactory.getDriver());
		newUser=new 	NewUserPage(BrowserFactory.getDriver());
	}

	@When("user is able to click new User? SignUp button")
	public void user_is_able_to_click_new_user_sign_up_button() 
	{
	    loginPage.clickSignUp();
	}

	/*@When("user check if signup is enabled or not")
	public void user_check_if_signup_is_enabled_or_not() 
	{
	//Assert.assertTrue(newUser.signupIsEnabled());
	}
	*/
	@When("User enters {string} name")
	public void user_enters_name(String name) 
	{
		newUser.endterName(name);
	}
	
	

	@When("user enters email")
	public void user_enters_email(String email) 
	{
		newUser.enterEmail(email);
	}

	@When("user enter password")
	public void user_enter_password(String password) 
	{
	    newUser.enterPassword(password);
	}

	@When("User select interests")
	public void user_select_interests() 
	{
	    newUser.selectInterest();
	}

	@When("User select gender")
	public void user_select_gender() 
	{
	    newUser.genderSelection();
	}

	@When("user select state")
	public void user_select_state() 
	{
	    newUser.selectState();
	}

	@When("user select hobbies")
	public void user_select_hobbies() 
	{
	    newUser.selectHobby();
	}

	@Then("user click sign up button")
	public void user_click_sign_up_button() 
	{
		Assert.assertTrue(newUser.signUpMess());
	}
	
}

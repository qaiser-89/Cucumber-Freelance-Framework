package stepDefination;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddCourseToCartPage;
import pages.HomePage;
import pages.LoginPage;

public class AddNewCourseToCart 
{
	LoginPage login;
	HomePage home;
	AddCourseToCartPage addCourse;
	@Given("User was able to launch the app")
	public void user_was_able_to_launch_the_app() 
	{
	    login=new LoginPage(BrowserFactory.getDriver());
	    home=new HomePage(BrowserFactory.getDriver());
	    addCourse = new AddCourseToCartPage(BrowserFactory.getDriver());
	}

	@Given("User was able to login to app")
	public void user_was_able_to_login_to_app() 
	{
	    login.typeUserName("admin@email.com");
	    login.typePassword("admin@123");
	    login.clickSignIn();
	}

	@Given("User was able to load homepage")
	public void user_was_able_to_load_homepage() 
	{
	    home.isManageDisplayed();
	}

	@When("user click add to cart")
	public void user_click_add_to_cart() 
	{
		addCourse.addCourseIfSeleniumPresent();
	}

	@Then("Courses added to cart")
	public void courses_added_to_cart() 
	{
	   System.out.println("confirm course added");
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.Utility;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email = By.xpath("//input[@placeholder='Enter Email']");
	By password= By.xpath("//input[@placeholder='Enter Password']");
	By login_buttun=By.xpath("//button[normalize-space()='Sign in']");
	By signup_button =By.xpath("//a[normalize-space()='New user? Signup']");

	
	public void typeUserName(String username)
	{
		Utility.waitForElement(driver, email).sendKeys(username);
	}
	
	public void typePassword(String pass)
	{
		Utility.waitForElement(driver, password).sendKeys(pass);
	}
	public void clickSignIn()
	{
		Utility.waitForElement(driver, login_buttun).click();
	}
	
	public void clickSignUp()
	{
		Utility.waitForElement(driver, signup_button).click();
	}
}

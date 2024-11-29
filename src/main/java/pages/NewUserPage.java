package pages;

import java.security.PublicKey;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class NewUserPage 
{
	WebDriver driver;
	
	public NewUserPage(WebDriver driver)
	{
		this.driver = driver;
	}

	 By signUp_mess = By.xpath("//h2[normalize-space()='Sign Up']");
	 By name_field = By.xpath("//input[@id='name']");
	 By email_field = By.xpath("//input[@id='email']");
	 By password_field = By.xpath("//input[@id='password']");
	 By statetoselect = By.xpath("//select[@id='state']");
	 By interestselect= By.xpath("//label[@class='interest']");
	 By genderselect= By.xpath("//label[normalize-space()='Male']");
	 By hobbies_field = By.xpath("//select[@id='hobbies']");
	 By signup_btn = By.xpath("//button[normalize-space()='Sign up']");
	 By successful_msg = By.xpath("//div[contains(text(),'Signup successfully, Please login!')]");

	
	public void showedSignup()
	{
		Utility.waitForElement(driver, signUp_mess).isDisplayed();
	}
	
	public boolean signupIsEnabled()
	{
		boolean sigupisDisabled=Utility.waitForElement(driver, signup_btn).isEnabled();
		return sigupisDisabled;
		
	}
	
	public void endterName(String name)
	{
		Utility.waitForElement(driver, name_field).sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		Utility.waitForElement(driver, email_field).sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
		Utility.waitForElement(driver, password_field).sendKeys(pass);
	}
	
	public void selectHobby()
	{
		List<WebElement> listofhobbies	=driver.findElements(hobbies_field);
		for(WebElement hobbieslist:listofhobbies)
		{
			System.out.println(hobbieslist);
			Select select=new Select(hobbieslist);
			select.selectByValue("Reading");
		}
	}
	
	public void selectInterest()
	{
		List<WebElement> interest=	driver.findElements(interestselect);
		
		for(WebElement ele:interest)
		{
			System.out.println("Following Interests are Available: "+ele.getText());
			
			if(ele.getText().equalsIgnoreCase("Selenium"))
			{
				ele.click();
			}
		}
	}
	
	public void genderSelection()
	{
		Utility.waitForElement(driver, genderselect); 
	}
	
	public void selectState()
	{
		WebElement statElement=	driver.findElement(By.xpath("selectState"));
		Select sleSelect=new Select(statElement);
		sleSelect.selectByValue("Goa");
	}
	
	public void clickSignUpButn()
	{
		Utility.waitForElement(driver, signup_btn).click();
	}
	

public boolean signUpMess()
{
	boolean status = false;
	
	try {
		status = Utility.waitForElement(driver, successful_msg, 10).isDisplayed();
	} 
	catch (Exception e)
	{
		System.out.println((""+e.getMessage()));
	}

	return status;
}
	
}

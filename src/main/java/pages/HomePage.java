package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By manage_button = By.xpath("//span[normalize-space()='Manage']");

	
	public boolean isManageDisplayed()
	{
		boolean manage_status=driver.findElement(manage_button).isDisplayed();
		return manage_status;
	}
}

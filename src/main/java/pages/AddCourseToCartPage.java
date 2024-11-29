package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddCourseToCartPage 
{
	WebDriver driver;
	public AddCourseToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By list_of_courses = By.xpath("//div[@class='course-card row']//h2");
	By list_of_prices =  By.xpath("//div[@class='course-card row']//span[contains(normalize-space(),'Price:')]");
	By cart_button = By.xpath("//button[normalize-space()='Cart']");
	By cart_container = By.xpath("//span[@class='count']");
	
	
	public void addCourseIfSeleniumPresent()
	{
		List<WebElement> list= driver.findElements(list_of_courses);
		
		for(WebElement element:list)
		{
			String string_list=element.getText();
			System.out.println("List of Courses is: "+element.getText());
			
			if(string_list.equalsIgnoreCase("Selenium"))
			{
				element.click();
			}
		}
		
	}
	
}

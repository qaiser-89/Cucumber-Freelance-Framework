package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import dataprovider.ConfigReader;

public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static WebDriver startBrowser(String browserName, String appURL)
	{
		if(browserName.equalsIgnoreCase("Chrome")|| browserName.equalsIgnoreCase("Google Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")|| browserName.equalsIgnoreCase("Mozilla FireFox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")|| browserName.equalsIgnoreCase("Microsoft Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Safari")|| browserName.equalsIgnoreCase("Apple safari"))
		{
			driver=new SafariDriver();
		}
		driver.manage().window().maximize();
		//Integer.parseInt(ConfigReader.getProperty("implicitwait")); we are parsing the string which we are getting from config.properties to int and passing that in below line!!!!
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("implicitwait"))));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("pageLoadTimeout"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Integer.parseInt(ConfigReader.getProperty("scriptTimeOut"))));
		driver.get(appURL);
		return driver;
	}
	
	public static void closeDriver()
	{
		driver.quit();
	}

}

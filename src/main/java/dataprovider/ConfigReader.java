package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	
	public static String getProperty(String key)
	{
		String value=null;
		Properties property=new Properties();
		try {
			property.load(new FileInputStream(new File("./Configuration/Config.properties")));
			
			value=property.getProperty(key);
		} 
		catch (FileNotFoundException e) 
		
		{
			System.out.println("LOG: INFO File not found "+e.getMessage());
		} 
		catch (IOException e) 
		{
			System.out.println("LOG: INFO Somethin went wrong please check Confg.reader from DataProvider"+e.getMessage());
		}

		return value;
	}

}

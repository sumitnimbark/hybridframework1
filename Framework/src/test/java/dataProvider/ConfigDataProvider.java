package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties prop;
	
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/Config.properties");
		
		try {
			
			FileInputStream fs = new FileInputStream(src);
			
			prop = new Properties();
			
			prop.load(fs);
			
		} catch (Exception e)
		
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationurl() 
	{
		String url=prop.getProperty("url");
		
		return url;
	}
	
	public String getChromePath() 
	{
		String chromePath=prop.getProperty("ChromeDriverPath");
		
		return chromePath;
	}
	
	public String getFirefoxpath() 
	{
		String firefoxPath=prop.getProperty("FirefoxDriverPath");
		
		return firefoxPath;
	}
	
	public String getIEPath() 
	{
		String iePath=prop.getProperty("IEDriverPath");
		
		return iePath;
	}
}

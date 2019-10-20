package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProvider.ConfigDataProvider;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("Firefox")) {
			
			//System.setProperty("webdriver.gec", value)
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
			
			ConfigDataProvider Conf = new ConfigDataProvider();
			System.setProperty("webdriver.chrome.driver", Conf.getChromePath());
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			
			ConfigDataProvider Conf = new ConfigDataProvider();
			System.setProperty("webdriver.ie.driver", Conf.getIEPath());
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser(WebDriver ldriver) {
		
		ldriver.quit();
	}
}

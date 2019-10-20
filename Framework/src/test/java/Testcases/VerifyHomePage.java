package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyHomePage {
	
	WebDriver driver;
	
	@Test
	public void TestHomePage() {
		
		driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		
		String Title = Home.getTitle();
		
		System.out.println("My Application is: "+Title);
		
		Home.clickSignup();
		
	}

}

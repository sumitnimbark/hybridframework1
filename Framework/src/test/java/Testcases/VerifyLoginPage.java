package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPage {

	WebDriver driver;
	
	@Test
	public void TestLoginPage() {
		
		driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		
		String Title = Home.getTitle();
		
		System.out.println("My Application is: "+Title);
		
		Home.clickSignup();
		
		LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
		
		Login.enterEmail(DataProviderFactory.getExcel().getData(0, 0, 0));
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		BrowserFactory.closeBrowser(driver);
	}
}

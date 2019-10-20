package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.HomePage;
import Pages.LoginPage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class VerifyLoginPageWithReport {

	WebDriver driver;
	
	ExtentReports report;
	
	ExtentTest logger;
	
	@Test
	public void TestLoginPage() {
		
		report = new ExtentReports(".\\Reports\\LoginReport.html",true);
		
		logger = report.startTest("Test to Verify Login");
		
		driver = BrowserFactory.getBrowser("chrome");
		
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		
		logger.log(LogStatus.INFO, "App is up and running");
		
		HomePage Home = PageFactory.initElements(driver, HomePage.class);
		
		String Title = Home.getTitle();
		
		System.out.println("My Application is: "+Title);
		
		logger.log(LogStatus.PASS, "Title name captured successfully!");
		
		Home.clickSignup();
		
		logger.log(LogStatus.INFO, "SignUp link clicked!");
		
		LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
		
		Login.enterEmail(DataProviderFactory.getExcel().getData(0, 0, 0));
		
		logger.log(LogStatus.PASS, "On Login page!");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		BrowserFactory.closeBrowser(driver);
		report.endTest(logger);
		report.flush();
	}
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name="email") WebElement email;
	
	public LoginPage(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	
	public void enterEmail(String emailfromexcel) {
		
		email.sendKeys(emailfromexcel);
	}
	

}

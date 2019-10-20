package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver) {
		
		this.driver=ldriver;
		
	}
	
	@FindBy(xpath="/html/body/div[1]/main/section[1]/a") WebElement Signup;
	
	public void clickSignup() {
		
		Signup.click();
	}
	
	public String getTitle() {
		
		String title = driver.getTitle();
		
		return title;
	}

}

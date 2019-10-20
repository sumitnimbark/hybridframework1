package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver, String screenshotName) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File scrn = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = "F:\\Workspace2\\Framework\\Screenshots\\"+screenshotName+System.currentTimeMillis()+".png";
		
		try {
			
			FileUtils.copyFile(scrn, new File(destination));
			
		} catch (IOException e) 
		{
			System.out.println("Failed to Capture Screenshot"+e.getMessage());

		}
		return destination;
	}

}

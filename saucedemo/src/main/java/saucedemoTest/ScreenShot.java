package saucedemoTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public void picture(String st, WebDriver driver ) throws IOException {
		
	TakesScreenshot  s = (TakesScreenshot)driver;
	File pic = s.getScreenshotAs(OutputType.FILE);
	File e = new File ("C:\\Users\\Owner\\eclipse-workspace\\saucedemo\\src\\main\\resources\\picture\\"+st+".png"); 
	FileUtils.copyFile(pic, e);
	
	}
	
}
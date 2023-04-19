package saucedemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverConnection {

	@BeforeTest

	public WebDriver getchrome() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\User\\Owner\\OneDrive\\Desktop\\Allbrowser\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		return driver;
	}

	public WebDriver getedge() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Owner\\eclipse-workspace\\pagetest\\driver\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;

	}

}



package testing;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import saucedemoTest.ScreenShot;

public class ProductcekOut extends LogingPage {
	ScreenShot sc = new ScreenShot();

	@Test(priority = 3)
	public void picture() throws Exception {
		sc.picture("pic1", super.driver);
	}

	@Test(priority = 4)
	public void click() throws IOException {
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
	}

	@Test(priority = 5)
	public void addtocart() throws Exception {
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		sc.picture("pic2", driver);
	}

	@AfterTest
	public void close() throws InterruptedException {
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
	}

}
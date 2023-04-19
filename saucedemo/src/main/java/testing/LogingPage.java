package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import saucedemoTest.DriverConnection;

public class LogingPage {
    	 WebDriver driver = null ;
    
    @Test
    public void openwebpage() {
	 DriverConnection dc = new DriverConnection(); 
	 
     try {
		driver = dc.getchrome();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		//e.printStackTrace();
	}
    if (driver == null)
   { driver =dc.getedge();
	}
	 
     String expectedtitle ="Swag Labs";
	 driver.get("https://www.saucedemo.com/");
	 String actualitel = driver.getTitle();
	 System.out.println("Tag is: " + actualitel);
	 Assert.assertEquals(actualitel, expectedtitle);
     driver.manage().window().maximize();
     System.out.println("website got open");
     }

	
    @Test(description = "positive testing", priority = 2)

	public void rightnamepass() {

		driver.findElement(By.name("user-name")).clear();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(description = "negetive testing", priority = 1)

	public void wrongname() throws InterruptedException {

		driver.findElement(By.name("user-name")).sendKeys("standard");
		driver.findElement(By.id("password")).sendKeys("secret");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}


}

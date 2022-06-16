package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Firefoxtest {
	WebDriver driver;
	@BeforeClass
	public void Firefox(){
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	 driver=new FirefoxDriver();
		
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
	
	

}

package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Basetest {
	public static WebDriver driver;
    @Parameters("browser")
	@BeforeClass
	public void chrome(@Optional("chrome")String browser){
		
		
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	}
	   else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   driver=new FirefoxDriver();
		   }
	}

	@AfterClass
	public void close(){
		driver.close();
	}
	
}

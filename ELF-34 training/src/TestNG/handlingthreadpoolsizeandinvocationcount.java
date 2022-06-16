package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingthreadpoolsizeandinvocationcount {
	
	@Test (threadPoolSize = 3 , invocationCount = 3)
	public void execute(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		
		driver.close();
		
		
	}
	
	
	

}

package TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class loginTCfordemowebshop {
	@Test (dataProvider="logintestcase")
	public static void login(String email,String Password){
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	    if(driver.findElement(By.className("ico-logout")).isDisplayed())
	    {
	    	System.out.println("Test case is success");
	    }
	    else{
	    	System.out.println("fail");
	    }
		
		driver.close();
	}
		
@DataProvider(name="logintestcase")
	
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		return Workingwithmultipleread.data("login");
	}
}

		
		
	

	
		
	
	
	
	
	
	


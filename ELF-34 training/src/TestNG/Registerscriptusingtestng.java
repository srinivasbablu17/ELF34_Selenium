package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registerscriptusingtestng {
	@Test (dataProvider="REG")
	public static void demo(String fn,String Ln,String Email,String password,String Conpassword,String Gender){
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.xpath("//input[@value='"+Gender+"']"));
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(Ln);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Conpassword);
		driver.findElement(By.id("register-button")).click();
		 if(driver.findElement(By.className("ico-logout")).isDisplayed())
		    {
		    	System.out.println("Test case is success");
		    }
		    else{
		    	System.out.println("fail");
		    }
			
			driver.close();
	}

@DataProvider(name="REG")
	
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		return Workingwithmultipleread.data("Register");
	}
	
}

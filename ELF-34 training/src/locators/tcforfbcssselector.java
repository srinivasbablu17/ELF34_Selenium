package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tcforfbcssselector {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit timeout
		///driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Explicit timeout
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		
		
		driver.get("https://www.facebook.com/");
		
	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"))));
		
	  
	  driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		String fn="prasad";
		driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys(fn);
		String ln="srinu";
		driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys(ln);
		String number="9242789780";
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys(number);
		String passw="bablu9690";
		driver.findElement(By.cssSelector("input[aria-label='New password']")).sendKeys(passw);
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		if(driver.findElement(By.cssSelector("button[name='websubmit']")).isEnabled())
		{
			System.out.println("Pass:Signup button is clicked");
		}
	
	   Robot robo=new Robot();
	
	
	}

}

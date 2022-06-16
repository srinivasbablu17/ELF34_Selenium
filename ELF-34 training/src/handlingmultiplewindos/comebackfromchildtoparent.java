package handlingmultiplewindos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class comebackfromchildtoparent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		String handle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String s:handles)
		{
			if(!s.equals(handle))
			{
				driver.switchTo().window(s);
				//driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Srinivas");
				driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("srinivas2002bablu@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bablu@9690");
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				driver.findElement(By.xpath("//input[@value='Sign up']")).click();
				Thread.sleep(3000);
				driver.close();			
			}
		}
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		
	}

}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemapsbyusingxpath {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@13.8131454,77.5046096,15z");
		Thread.sleep(2000);
		driver.findElement(By.id("hArJGc")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg51']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg51']/../../../..//button[@aria-label='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg52']")).sendKeys("Hindupur");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-controls='sbsg52']/../../..//button[@aria-label='Search']")).click();
		
		if(driver.findElement(By.xpath("//button[contains(text(),'Send directions to your phone')]")).isDisplayed()){
			System.out.println("test case is pass");
			
			
			
			
		}
		else
		{
			System.out.println("test case is Fail");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

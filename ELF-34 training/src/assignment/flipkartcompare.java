package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartcompare {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("cellphones");      //send in search
		driver.findElement(By.xpath("//button[@type='submit']")).click();                             //search
		WebElement  price = driver.findElement(By.xpath("(//div[contains(text(),'1,212')])[1]"));           //first product
		System.out.println(price.getText());    
		
		/*String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		for(String a:child)
		{
			if(parent.equals(child)==false)
			{
				driver.close();
				driver.switchTo().window(a);
			}
		}*/
		
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("lava a3");                     //send in search
		driver.findElement(By.xpath("//input[@type='submit']")).click();                         //search
		WebElement price1 = driver.findElement(By.xpath("(//span[text()='1,209'])[1]"));
		System.out.println(price1.getText());
		if(price.equals(price1)){
			
			System.out.println("Same price in both websites");
			
		}
		
		
		
		
		
}
}
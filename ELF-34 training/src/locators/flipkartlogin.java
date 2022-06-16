package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("srinivas2001bablu@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Bablu@9690");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazoncart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cellphones");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(4000);
		if(driver.findElement(By.xpath("//span[text()='Nokia 105 Single SIM (Black)']/../../../..//span[text()='1,349']")).isDisplayed())
		{
			System.out.println("pass");
		}
		
	}

}

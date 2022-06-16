package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookcopypaste {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("bablu9690");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		email.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.cssSelector("input[name='pass']"));
		password.sendKeys(Keys.CONTROL+"v");
	}

}

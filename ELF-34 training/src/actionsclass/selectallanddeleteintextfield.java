package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectallanddeleteintextfield {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement webe = driver.findElement(By.xpath("//input[@id='email']"));
		webe.sendKeys("srinivas");
		webe.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		webe.sendKeys(Keys.DELETE);
		
		
		
	}

}

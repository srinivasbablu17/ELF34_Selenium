package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class holdandrelease {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"))).perform();
		Thread.sleep(2000);
		act.release(driver.findElement(By.xpath("(//div[text()='Italy'])"))).perform();
		
		
		
		
		
		
	}

}

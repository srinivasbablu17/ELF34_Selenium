package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/dell/Downloads/LocatorsPractice.html");
	WebElement un = driver.findElement(By.className("username"));
	un.sendKeys("Srinivas bablu");
	WebElement pwd = driver.findElement(By.className("password"));
	pwd.sendKeys("bablu9290");
	WebElement ch = driver.findElement(By.className("checkbox"));
	ch.click();
	WebElement ma = driver.findElement(By.name("a"));
	ma.click();
	WebElement fe = driver.findElement(By.name("b"));
	fe.click();
	WebElement bu = driver.findElement(By.className("button"));
	bu.click();
	WebElement link = driver.findElement(By.tagName("a"));
	link.click();

	
	
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	

	
}
}

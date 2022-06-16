package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamelocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/dell/Downloads/HTMLDemoPage.html");
	WebElement d = driver.findElement(By.tagName("a"));
    d.click();
    Thread.sleep(2000);
    driver.close();
    
	
}
}

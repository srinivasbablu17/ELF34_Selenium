package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mutipleinputtags {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/SampleHTMLPage.html");
		WebElement d1 = driver.findElement(By.tagName("input"));
		d1.sendKeys("Srinivas bablu");
		Thread.sleep(2000);
		driver.close();
	}

}

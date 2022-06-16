package handlingmultiplewindos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoparentwindowiframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Downloads/iframe.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='COVID']")).click();
		Thread.sleep(4000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		Thread.sleep(2000);
		
		
	}

}

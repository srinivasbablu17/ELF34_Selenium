package handlingmultiplewindos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwithiframes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Downloads/iframe.html");
		
		//driver.switchTo().frame("frame1");
	
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
		
		
		
		//driver.switchTo().frame(0);
		///Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='MOVIES']")).click();
		
	}

}

package assignment;


//submit


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethod13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement sfs = driver.findElement(By.cssSelector("input[value='Search store']"));
		sfs.sendKeys("assfsf");
		Thread.sleep(2000);
		sfs.submit();
	
		
		
	}

}

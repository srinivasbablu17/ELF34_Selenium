package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovercomputers {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.partialLinkText("COMPUTERS"))).build().perform();
	Thread.sleep(2000);
	act.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
	act.click(driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../..//input"))).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-productid='72']")).click();
	driver.findElement(By.partialLinkText("Shopping")).click();
	Thread.sleep(3000);
	if(driver.findElement(By.xpath("(//a[contains(text(),'Build')])[2]")).isDisplayed())
	{
		System.out.println("Pass:Product is displayed");
	}
	
	
}
}

package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntramousehover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='women']"))).build().perform();
		Thread.sleep(2000);
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']"))).build().perform();
		Thread.sleep(2000);
		a.click(driver.findElement(By.xpath("(//a[text()='T-Shirts'])[2]"))).perform();
		
		
		
		
		
		
		
	}

}

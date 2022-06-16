package handlingmultiplewindos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingactionswithalert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double')]"))).click().perform();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
	
		
		
		
		
	}

}

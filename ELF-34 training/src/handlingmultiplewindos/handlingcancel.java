package handlingmultiplewindos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingcancel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.cssSelector("input[name='cusid']")).sendKeys("142434");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		Alert alert=driver.switchTo().alert();
		//Thread.sleep(2000);
		alert.dismiss();
		
		
		driver.quit();
		
	}

}

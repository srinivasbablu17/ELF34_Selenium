package handlingmultiplewindos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwithparentandchild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		WebElement ele = driver.findElement(By.xpath("//button[@id='windowButton']"));
		ele.click();
	   String handle = driver.getWindowHandle();
	   Set<String> handles = driver.getWindowHandles();
	   for(String s:handles)
	   {
		   if(!s.equals(handle))
		   {
			   driver.switchTo().window(s);
			   Thread.sleep(2000);
			   driver.close();
		   }
		   
		   
			   
	   }
	
	
	
	
	
	}

}

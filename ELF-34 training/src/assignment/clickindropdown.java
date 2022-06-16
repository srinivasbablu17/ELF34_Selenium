package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clickindropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Downloads/demo.html");
		driver.findElement(By.id("standard_cars")).click();
		WebElement dr = driver.findElement(By.id("standard_cars"));
		
		Select drop=new Select(dr);
		List<WebElement> option = drop.getOptions();
		for(int i=0;i<option.size();i++)
		{
			option.get(i).click();
			Thread.sleep(2000);
		}
	    
		
	}

}

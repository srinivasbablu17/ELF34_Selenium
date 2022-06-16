package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listcaritems {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Downloads/demo.html");
		driver.findElement(By.id("standard_cars")).click();
		WebElement option = driver.findElement(By.id("standard_cars"));
		Select down=new Select(option);
		List<WebElement> options = down.getOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
			
	}

}

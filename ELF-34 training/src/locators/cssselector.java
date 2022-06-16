package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Downloads/LocatorsPractice.html");
		String UN="srinivas";
		driver.findElement(By.cssSelector("input[class='username']")).sendKeys(UN);
		String PWD="Bablu@9234";
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys(PWD);
		driver.findElement(By.cssSelector("input[class='checkbox']")).click();
		driver.findElement(By.cssSelector("input[value='submit']")).click();
		driver.findElement(By.cssSelector("input[value='cancel']")).click();
		driver.findElement(By.cssSelector("input[name='b']")).click();
		driver.findElement(By.cssSelector("input[name='a']")).click();
		driver.quit();
		
		
		
		
	}

}

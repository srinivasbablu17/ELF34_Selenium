package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcasefordemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-male")).click();
	//driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("sreenivas");
	driver.findElement(By.id("LastName")).sendKeys("bablu");
	driver.findElement(By.id("Email")).sendKeys("srinivas12bablu@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Bablu@9690");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Bablu@9690");
	driver.findElement(By.id("register-button")).click();
	
	
}
}

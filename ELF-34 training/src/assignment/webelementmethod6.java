package assignment;


//getlocation


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethod6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		System.out.println(sortby.getLocation());
	}
}

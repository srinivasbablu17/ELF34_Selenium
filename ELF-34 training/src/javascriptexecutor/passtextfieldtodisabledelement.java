package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class passtextfieldtodisabledelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		 WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));
		 
		 
		 JavascriptExecutor e1=(JavascriptExecutor)driver;
		 e1.executeScript("arguments[0].value='srinivas';",element);
		 
		 
		 
	}

}

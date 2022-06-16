package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclassobject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		//WebElement pro = driver.findElement(By.id("products-orderby"));
		
		for(int i=0;i<=5;i++){
			WebElement pro = driver.findElement(By.id("products-orderby"));
			Select dropdown=new Select(pro);
			dropdown.selectByIndex(i);
			Thread.sleep(3000);
			
		}
		
	
		
		
		
		
	}
	

}

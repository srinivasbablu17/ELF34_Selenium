package handlingmultiplewindos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		
		
		String handle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String s:handles)
		{
			if(s.equals(handle)){
				driver.switchTo().window(s);
				
				
			}
			else
			{
				driver.switchTo().window(s);
				driver.close();
				System.out.println("pass");
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

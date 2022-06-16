package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsdemowebshop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='pollanswers-1']"));
	   /* for(int i=0;i<radio.size();i++)
	    {
	    	radio.get(i).click();
	    }*/
		for(WebElement r:radio)
		{
			r.click();
		}
	
	}

}

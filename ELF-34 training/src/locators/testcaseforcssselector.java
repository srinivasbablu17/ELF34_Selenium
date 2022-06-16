package locators;

import javax.sound.midi.Synthesizer;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcaseforcssselector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String search="Books";
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys(search);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		try{
			
		
			if(driver.findElement(By.cssSelector("div[data-productid='74']")).isDisplayed())
			{
				System.out.println("pass");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("fail");
		}
		
		/*else
		{
			System.out.println("fail");
		}*/
	}

}

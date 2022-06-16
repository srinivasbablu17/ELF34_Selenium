package browseroptions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class workingwithscreenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		LocalDateTime sysdate=LocalDateTime.now();
		String easy=sysdate.toString().replace(":", "-");
		
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		WebElement elem = driver.findElement(By.xpath("//div[contains(text(),'worry ')]"));
		if(elem.isDisplayed())
		{
			File fi = elem.getScreenshotAs(OutputType.FILE);
			File d=new File("./Screenshots/"+easy+".png");
			try {
				FileHandler.copy(fi, d);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}

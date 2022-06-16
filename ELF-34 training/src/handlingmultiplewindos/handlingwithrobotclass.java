package handlingmultiplewindos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwithrobotclass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robo.keyRelease(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        driver.quit();
        
        
        
        
        
		
	}

}

package classicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forwardandback {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
	}

}

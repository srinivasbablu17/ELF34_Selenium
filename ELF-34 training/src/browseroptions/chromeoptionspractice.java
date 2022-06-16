package browseroptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeoptionspractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		option.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println("pass");
		
		
		
	}

}

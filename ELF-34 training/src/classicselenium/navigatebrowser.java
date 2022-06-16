package classicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigatebrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
	}

}

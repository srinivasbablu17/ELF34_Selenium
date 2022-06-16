package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listdropdownoptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select dropdown=new Select(display);
		List<WebElement> fetch = dropdown.getOptions();
		for(WebElement list:fetch)
		{
			System.out.println(list.getText());
		}
		
	}

}

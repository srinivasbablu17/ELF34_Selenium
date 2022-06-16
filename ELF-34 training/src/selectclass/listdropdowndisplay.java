package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listdropdowndisplay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select dropdown=new Select(sortby);
		List<WebElement> optons = dropdown.getOptions();
		for(int i=0;i<optons.size();i++)
		{
			System.out.println(optons.get(i).getText());
		}
}
}


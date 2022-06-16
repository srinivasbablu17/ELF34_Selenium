package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tcforaddtocartxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		String text=driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[3]/a[text()='Computing and Internet']")).getText();
		if(text.contains("Computing"))
		{
			System.out.println("Pass: Product is displayed");
		}
		
		
		
	}

}

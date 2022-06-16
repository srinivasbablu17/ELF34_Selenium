package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart3xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("APPAREL")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//div//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/../..//div//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Genuine Leather Handbag with Cell Phone Holder & Many Pockets']/../..//input")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Shopping")).click();
		for(int i=1;i<=2;i++){
			
		driver.findElement(By.xpath("(//table)[1]//tbody//tr["+i+"]//td[1]//input")).click();
	}
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
	
	}

}

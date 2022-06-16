package assignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkartquantity {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("cellphones");                        //Send keys in search
		driver.findElement(By.xpath("//button[@type='submit']")).click();                            //
		WebElement  price = driver.findElement(By.xpath("(//div[contains(text(),'1,212')])[1]"));           //first product
		System.out.println(price.getText());                             //print price
		driver.findElement(By.xpath("(//div[contains(text(),'1,212')])[1]")).click(); 
		
		
		Set<String> child = driver.getWindowHandles();
		
		for(String a:child)
		{
			if(!(a.equals(parent)))
			{
				driver.switchTo().window(a);
			}
		}
		//add to cart
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();    
		driver.findElement(By.xpath("//span[text()='Cart']")).click();//click on cart page
		WebElement qty = driver.findElement(By.xpath(""));
		Select dropdown=new Select(qty);                             //select clause
		List<WebElement> quan = dropdown.getOptions();               
		for(int i=0;i<=quan.indexOf(1);i++){
			quan.get(i).click();
		}
        WebElement price1 = driver.findElement(By.xpath(""));           //print price
        System.out.println(price1.getText());                           //get price
	

		
	}

}

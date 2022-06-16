package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    String email="srinivas2001bablu@gmail.com";
	    driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
	    String password="Bablu@9690";
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    try{
	    	
	    
	    if( driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed())
	    {
	    	System.out.println("Pass:User is successfully loggedin");
	    }
	    }
	    catch(NoSuchElementException e)
	    {
	    	System.out.println("Fail:user is not able to loggedin");
	    }
	}

}

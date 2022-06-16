package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithouthardcode {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String Title = driver.getTitle();
		if(Title.contains("Web"))
		{
			System.out.println("Pass:Home page is displayed");
		}
		driver.findElement(By.className("ico-register")).click();
		String getreg = driver.getTitle();
		if(getreg.contains("Register"))
		{
			System.out.println("Pass:Register page is displayed");
		}
		driver.findElement(By.id("gender-male")).click();
		String  Firstname="srinivas";
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		String Lastname="prasad";
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		String mail="adqwqwrref21@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(mail);
		String password="Bablu@9690";
		driver.findElement(By.id("Password")).sendKeys(password);
		String conpass=password;
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpass);
		driver.findElement(By.id("register-button")).click();
		if(driver.findElement(By.className("ico-logout")).isEnabled())
		{
			System.out.println("user is loggedin ");
		}
		
		driver.findElement(By.className("ico-logout")).click();
		String title1 = driver.getTitle();
		if(title1.equalsIgnoreCase("demo"))
		{
			System.out.println("Demo app is super");
		}
		
		
		
		
		
		
	}

}

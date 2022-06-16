package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class handlingwithsoftassert extends Basetest {

	
	
	@Test
	public void run(){
		
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	WebElement shoping = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
	
	SoftAssert asset=new SoftAssert();
	/*asset.assertEquals(shoping.getText(), "Login", "pass");
	shoping.click();
	asset.assertAll();*/
	
	/*asset.assertEquals(shoping.getText(), "Login");
	shoping.click();
	asset.assertAll();*/


	
	
	
	
	
	
	
	
	
	
	
	
}
}
package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class workingwithhardassert extends Basetest{
	
	@Test
	public void run(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement shoping = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		
		//Assert.assertEquals(shoping.getText(), "Shopping cart", "Pass");
		
		//shoping.click();
		
		//Assert.assertTrue(true, "pass");
		//shoping.click();
		
		//Assert.assertFalse(false, "pass");
	      //shoping.click();
	
        Assert.assertNotEquals(true, "pass");
        shoping.click();
}
}
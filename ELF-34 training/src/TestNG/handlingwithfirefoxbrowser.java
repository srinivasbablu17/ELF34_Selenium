package TestNG;

import org.testng.annotations.Test;

public class handlingwithfirefoxbrowser extends Basetest{
	@Test
	public void launch(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
	}
}

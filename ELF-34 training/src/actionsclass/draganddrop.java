package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	WebElement source = driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
	Thread.sleep(2000);
	WebElement desti = driver.findElement(By.xpath("(//div[contains(text(),'Italy')])"));
	Actions act=new Actions(driver);
	act.dragAndDrop(source, desti).build().perform();
	Thread.sleep(2000);
	
	
	
	
	WebElement source1 = driver.findElement(By.xpath("(//div[contains(text(),'Madrid')])[2]"));
	Thread.sleep(2000);
	WebElement desti1 = driver.findElement(By.xpath("(//div[contains(text(),'Spain')])"));
	act.dragAndDrop(source1, desti1).build().perform();
	Thread.sleep(2000);
	

	WebElement source2= driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]"));
	Thread.sleep(2000);
	WebElement desti2 = driver.findElement(By.xpath("(//div[contains(text(),'Norway')])"));
	act.dragAndDrop(source2, desti2).build().perform();
	Thread.sleep(2000);;
	
	WebElement source3= driver.findElement(By.xpath("(//div[contains(text(),'Copenhagen')])[2]"));
	Thread.sleep(2000);
	WebElement desti3 = driver.findElement(By.xpath("(//div[contains(text(),'Denmark')])"));
	act.dragAndDrop(source3, desti3).build().perform();
	Thread.sleep(2000);
	
	WebElement source4= driver.findElement(By.xpath("(//div[contains(text(),'Seoul')])[2]"));
	Thread.sleep(2000);
	WebElement desti4 = driver.findElement(By.xpath("(//div[contains(text(),'South Korea')])"));
	act.dragAndDrop(source4, desti4).build().perform();
	Thread.sleep(2000);
	
	WebElement source5= driver.findElement(By.xpath("(//div[contains(text(),'Stockholm')])[2]"));
	Thread.sleep(2000);
	WebElement desti5 = driver.findElement(By.xpath("(//div[contains(text(),'Sweden')])"));
	act.dragAndDrop(source5, desti5).build().perform();
	Thread.sleep(2000);
	
	WebElement source6= driver.findElement(By.xpath("(//div[contains(text(),'Washington')])[2]"));
	Thread.sleep(2000);
	WebElement desti6 = driver.findElement(By.xpath("(//div[contains(text(),'United States')])"));
	act.dragAndDrop(source6, desti6).build().perform();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

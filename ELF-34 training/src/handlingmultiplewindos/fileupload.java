package handlingmultiplewindos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://smallpdf.com/pdf-to-word");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:/Demo workshop/Sreenivasprasad_Resume (1).pdf");
}
}

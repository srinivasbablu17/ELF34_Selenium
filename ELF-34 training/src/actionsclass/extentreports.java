package actionsclass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreports {
	static WebDriver driver;
	public static void main(String[] args) {
		
		LocalDateTime sysdate=LocalDateTime.now();
		String Reportname=sysdate.toString().replaceAll(":", "-");
		
		
		
		ExtentReports report=new ExtentReports("./Reports/"+Reportname+"report.html", false);
		ExtentTest test=report.startTest("reports");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser is Launched");
		test.log(LogStatus.SKIP, "not maximizing");
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		test.log(LogStatus.INFO, "Zomato is opened");
		WebElement scroll = driver.findElement(By.xpath("//h5[text()='Indiranagar']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",scroll);
		
		test.log(LogStatus.PASS, "Scrolled the page");
		test.log(LogStatus.FATAL, "Tabs are not displaying");
		test.log(LogStatus.INFO, test.addScreenCapture(ScreenCapture()));
		
		report.endTest(test);
		report.flush();
		
	}
	
	public static String ScreenCapture(){
		
		LocalDateTime sysdate=LocalDateTime.now();
		String Screenshotname=sysdate.toString().replaceAll(":", "-");
		
		String path="./Screenshots/"+Screenshotname+".png";
		TakesScreenshot tf=(TakesScreenshot)driver;
		File temp=tf.getScreenshotAs(OutputType.FILE);
		File desti=new File(path);
		try {
			FileHandler.copy(temp, desti);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "."+path;
		
		
		
	}
	

}

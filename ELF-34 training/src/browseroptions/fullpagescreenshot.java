package browseroptions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class fullpagescreenshot {
	public static void main(String[] args) {
		
		LocalDateTime sysdate=LocalDateTime.now();
		String full=sysdate.toString().replace(":", "-");
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		
		
		
		TakesScreenshot tf= (TakesScreenshot)driver;
		File temp = tf.getScreenshotAs(OutputType.FILE);
		File desti=new File("./Screenshots/"+full+".jpg");
		try {
			FileHandler.copy(temp, desti);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}

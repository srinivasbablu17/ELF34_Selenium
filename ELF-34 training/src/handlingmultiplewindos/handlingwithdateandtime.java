package handlingmultiplewindos;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwithdateandtime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		LocalDateTime df= LocalDateTime.now();
		String date=df.toString().replaceAll(":", "-");
		System.out.println(date);
		
		

	}

}

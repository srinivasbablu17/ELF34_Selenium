package classicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class openbrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
	}

}

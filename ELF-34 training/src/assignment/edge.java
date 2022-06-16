package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
}
}

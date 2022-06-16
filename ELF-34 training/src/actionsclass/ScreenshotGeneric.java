package actionsclass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import TestNG.Basetest;

public class ScreenshotGeneric extends Basetest{
	
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

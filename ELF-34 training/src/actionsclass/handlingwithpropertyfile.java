package actionsclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class handlingwithpropertyfile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/config1.properties");
		Properties property=new Properties();
		property.load(fis);
	    System.out.println(property.getProperty("URL"));
	}

}

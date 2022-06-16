package actionsclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class callingfilepropertyreadermethod {
	public static String reader(String key) throws IOException{
		
		FileInputStream fis=new FileInputStream("./Testdata/config1.properties");
		Properties property=new Properties();
		property.load(fis);
		
		return property.getProperty(key);
	}
}

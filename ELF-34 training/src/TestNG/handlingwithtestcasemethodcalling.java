package TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class handlingwithtestcasemethodcalling {
	
	@Test (dataProvider="testcase")//Sl.no	Name	College	Date	Execution	Phone number

	public void testcase(String slno,String name,String college,String date,String exec,String ph,String sheet1)
	{
		System.out.println(slno);
		System.out.println(name);
		System.out.println(college);
		System.out.println(date);
		System.out.println(exec);
		System.out.println(ph);
		
	}
		
	@DataProvider(name="testcase")
	
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		return Workingwithmultipleread.data("Register");
	}
	
	
	
	
	
	
	
	
	
	
}

package Pomrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNG.Basetest;
import TestNG.Workingwithmultipleread;
import actionsclass.callingfilepropertyreadermethod;
import actionsclass.propertyfileasgeneric;

public class callinglogintc extends Basetest{
	
    @Test(dataProvider="Testdata")
    public void login(String email,String password) throws IOException{
    	
    	driver.get(callingfilepropertyreadermethod.reader("URL"));
    	Welcomepage welcome=new Welcomepage(driver);
    	welcome.login();
    	
        loginPage login=new loginPage(driver);
    	login.emailfield(email);
        login.passwordfield(password);
        login.logbutton();
        
        
        HomePage home=new HomePage(driver);
        if(home.getLogoutlink().isDisplayed()){
        	
        	Reporter.log("Pass", true);
        }
	}
    
    @DataProvider(name="Testdata")
    public Object[][] data() throws EncryptedDocumentException, IOException{
      return	Workingwithmultipleread.data("login");
    }

}


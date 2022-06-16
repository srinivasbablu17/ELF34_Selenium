package Pomrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNG.Basetest;
import TestNG.Workingwithmultipleread;
import actionsclass.callingfilepropertyreadermethod;

public class callingregistertc extends Basetest{
	
	 @Test(dataProvider="Testdata1")
	    public void register(String fn,String ln,String email,String pass,String conpass) throws IOException{
	    	driver.get("http://demowebshop.tricentis.com/");
	    	//driver.get(callingfilepropertyreadermethod.reader("URL"));
	    	Welcomepage welcome=new Welcomepage(driver);
	    	welcome.register();
	    	
	    	
	    	RegisterPage register=new RegisterPage(driver);
	    	register.femaleradio();
	    	register.firstname(fn);
	    	register.lastname(ln);
	    	register.email(email);
	    	register.password(pass);
	    	register.conpass(conpass);
	    	register.registerbutton();
	    	
	    	HomePage home=new HomePage(driver);
	    	if(home.getWishlistlink().isDisplayed()){
	    		Reporter.log("pass", true);
	    	}
	    	
	    	
	 }	
	 
	 
	 @DataProvider(name="Testdata1")
     public Object[][] data() throws EncryptedDocumentException, IOException{
		 return Workingwithmultipleread.data("Register1");
	 }
}

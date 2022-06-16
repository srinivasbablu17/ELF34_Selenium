package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
     public Welcomepage(WebDriver driver){
    	 PageFactory.initElements(driver, this);
    	 
     }
     
     @FindBy(className="ico-register")
     private WebElement registerlink;
     
     public void register(){
    	 registerlink.click();
     }
     
     @FindBy(className="ico-login")
     private WebElement loginlink;
     
     public void login(){
    	 loginlink.click();
     }

     
     //Getters and setters//
     
     
     
	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}

	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}
     
     
}

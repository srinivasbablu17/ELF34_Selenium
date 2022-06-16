package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginPage {
	
	public loginPage(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	
	 @FindBy(className="ico-login")
	 private WebElement loginlink;
		
		public void clicklogin(){
			loginlink.click();
		}
	
	@FindBy(id="Email")
	private WebElement Emailtextfield;
	
	public void emailfield(String email){
		Emailtextfield.sendKeys(email);
	}
	@FindBy(id="Password")
	private	WebElement Passwordtextfield;
	
    public void passwordfield(String Password){
    	Passwordtextfield.sendKeys(Password);	
    }
    
    @FindBy(xpath="//input[@value='Log in']")
    private WebElement loginbutton;
    
    public void logbutton(){
    	loginbutton.click();
    	
    }
    
    
    //Getters and Setters

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getEmailtextfield() {
		return Emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}

	public void setEmailtextfield(WebElement emailtextfield) {
		Emailtextfield = emailtextfield;
	}

	public void setPasswordtextfield(WebElement passwordtextfield) {
		Passwordtextfield = passwordtextfield;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
    
}

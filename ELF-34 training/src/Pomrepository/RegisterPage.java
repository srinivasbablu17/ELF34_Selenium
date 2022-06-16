package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="ico-register")
	private WebElement registerlink;
	
	public void register(){
		registerlink.click();
	}
	
	@FindBy(xpath="//input[@id='gender-male']")
	private WebElement maleradiobutton;
	
	public void maleradio(){
		maleradiobutton.click();
	}
	
	@FindBy(xpath="//input[@id='gender-female']")
	private WebElement femaleradiobutton;
	
	public void femaleradio(){
		femaleradiobutton.click();
	}
	
	@FindBy(id="FirstName")
	private WebElement firstnametextfield;
	
	public void firstname(String fn){
		firstnametextfield.sendKeys(fn);
	}
	
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	
	public void lastname(String ln){
		
		lastnametextfield.sendKeys(ln);
	}
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	public void email(String email){
		emailtextfield.sendKeys(email);
		
	}
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	public void password(String pass){
		passwordtextfield.sendKeys(pass);
	}
	 
	@FindBy(id="ConfirmPassword")
	private WebElement conpasstextfield;
	public void conpass(String conpass){
		conpasstextfield.sendKeys(conpass);
	}
	
   
	@FindBy(id="register-button")
	private WebElement registerbutton;
	public void registerbutton(){
		registerbutton.click();
	}
	
	
	//Getters and setters
	
	
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}
	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}
	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}
	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}
	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}
	public WebElement getConpasstextfield() {
		return conpasstextfield;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}
	public void setMaleradiobutton(WebElement maleradiobutton) {
		this.maleradiobutton = maleradiobutton;
	}
	public void setFemaleradiobutton(WebElement femaleradiobutton) {
		this.femaleradiobutton = femaleradiobutton;
	}
	public void setFirstnametextfield(WebElement firstnametextfield) {
		this.firstnametextfield = firstnametextfield;
	}
	public void setLastnametextfield(WebElement lastnametextfield) {
		this.lastnametextfield = lastnametextfield;
	}
	public void setEmailtextfield(WebElement emailtextfield) {
		this.emailtextfield = emailtextfield;
	}
	public void setPasswordtextfield(WebElement passwordtextfield) {
		this.passwordtextfield = passwordtextfield;
	}
	public void setConpasstextfield(WebElement conpasstextfield) {
		this.conpasstextfield = conpasstextfield;
	}
	public void setRegisterbutton(WebElement registerbutton) {
		this.registerbutton = registerbutton;
	}
	
	
}

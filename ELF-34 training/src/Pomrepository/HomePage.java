package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText="BOOKS")
	private WebElement booksmajortab;
	
	public void books(){
		booksmajortab.click();
	}
	
	@FindBy(partialLinkText="COMPUTERS")
	private WebElement computersmajortab;
	
	public void computers(){
		computersmajortab.click();
	}
	
	@FindBy(partialLinkText="ELECTRONICS")
	private WebElement electronicsmajortab;
	
	public void electronics(){
		electronicsmajortab.click();
	}
    
	@FindBy(partialLinkText="APPAREL & SHOES")
	private WebElement apparelmajortab;
	
	public void apparel(){
		apparelmajortab.click();
	}
	
	@FindBy(partialLinkText="DIGITAL DOWNLOADS")
	private WebElement digidownloadmajortab;
	
	public void digidownload(){
		digidownloadmajortab.click();
	}
	
	@FindBy(partialLinkText="JEWELRY")
	private WebElement jewelrymajortab;
	
	public void jewelry(){
		jewelrymajortab.click();
	}
	
	@FindBy(partialLinkText="GIFTCARD")
	private WebElement giftcardmajortab;
	
	public void giftcard(){
		giftcardmajortab.click();
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	public void shoppingcart(){
		shoppingcartlink.click();
	}
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistlink;
	
	public void wishlist(){
		wishlistlink.click();
	}
	
	@FindBy(className="ico-logout")
	private WebElement logoutlink;
	
	public void logout(){
		logoutlink.click();
	}

	
	
	//Getters and setters
	
	
	public WebElement getBooksmajortab() {
		return booksmajortab;
	}

	public WebElement getComputersmajortab() {
		return computersmajortab;
	}

	public WebElement getElectronicsmajortab() {
		return electronicsmajortab;
	}

	public WebElement getApparelmajortab() {
		return apparelmajortab;
	}

	public WebElement getDigidownloadmajortab() {
		return digidownloadmajortab;
	}

	public WebElement getJewelrymajortab() {
		return jewelrymajortab;
	}

	public WebElement getGiftcardmajortab() {
		return giftcardmajortab;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public void setBooksmajortab(WebElement booksmajortab) {
		this.booksmajortab = booksmajortab;
	}

	public void setComputersmajortab(WebElement computersmajortab) {
		this.computersmajortab = computersmajortab;
	}

	public void setElectronicsmajortab(WebElement electronicsmajortab) {
		this.electronicsmajortab = electronicsmajortab;
	}

	public void setApparelmajortab(WebElement apparelmajortab) {
		this.apparelmajortab = apparelmajortab;
	}

	public void setDigidownloadmajortab(WebElement digidownloadmajortab) {
		this.digidownloadmajortab = digidownloadmajortab;
	}

	public void setJewelrymajortab(WebElement jewelrymajortab) {
		this.jewelrymajortab = jewelrymajortab;
	}

	public void setGiftcardmajortab(WebElement giftcardmajortab) {
		this.giftcardmajortab = giftcardmajortab;
	}

	public void setShoppingcartlink(WebElement shoppingcartlink) {
		this.shoppingcartlink = shoppingcartlink;
	}

	public void setWishlistlink(WebElement wishlistlink) {
		this.wishlistlink = wishlistlink;
	}

	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}
	
}

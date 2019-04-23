package BasePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageObjects extends basePage{

	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[1]/a")
	WebElement womenTab;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[2]/a")
	WebElement dressesTab;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]/a")
	WebElement tShirtsTab;
	
	@FindBy(xpath="//div[@id='center_column']/h1/span")
	WebElement catPageName;
	
	@FindBy(id="newsletter-input")
	WebElement subscrptionEmail;
	
	@FindBy(name="submitNewsletter")
	WebElement submitNewsletter;

		
	public homePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement womenTab() {
		return womenTab;
	}
	
	public WebElement dressesTab() {
		return dressesTab;
	}
	
	public WebElement tShirtsTab() {
		return tShirtsTab;
	}
	
	public WebElement getCatPageName() {
		return catPageName;
	}
	
	public WebElement subscrptionEmail() {
		return subscrptionEmail;
	}
	
	public WebElement submitNewsletter() {
		return submitNewsletter;
	}
	
}


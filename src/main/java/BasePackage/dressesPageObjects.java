package BasePackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class dressesPageObjects extends basePage {

	// @FindBy(xpath="//ul/li/div/span/input[@id='layered_id_attribute_group_1']")
	@FindBy(xpath="//li[.//div[./span/input[@id='layered_id_attribute_group_1']]]")
	 WebElement sCheckBox;
	 
	 @FindBy(xpath="//li[.//div[./span/input[@id='layered_id_attribute_group_2']]]")
	 WebElement mCheckBox;
	 
	 @FindBy(xpath="//li[.//div[./span/input[@id='layered_id_attribute_group_3']]]")
	 WebElement lCheckBox;
	 
	 @FindBy(xpath="//ul[@class='product_list grid row']/li")
	 List<WebElement> productList;
	 
	 @FindBy(xpath="//span[@class='heading-counter']")
	 WebElement headerProductCount;
	 
	 @FindBy (xpath="//ul[@class='product_list grid row']/li[1]")
	 WebElement firstProduct;
	 
	 @FindBy (xpath="//ul[@class='product_list grid row']/li[1]//div[@class='button-container']/a/span")
	 WebElement addToCartBtn;
	 
	 @FindBy(xpath="//div[@id='layer_cart']/div/div[1]/h2[text()]")
	 WebElement successNotificationAfterAddToCart;
	 
	 public dressesPageObjects() {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public WebElement sCheckBox() {
		 return sCheckBox;
	 }
	 
	 public WebElement mCheckBox() {
		 return mCheckBox;
	 }
		 
	 public WebElement lCheckBox() {
		 return lCheckBox;
	 }
	
	 public int productListCount() {
		 return productList.size();
	 }
	
	 public int headerProductCount() {
		 String headertext=headerProductCount.getText();
		 String[] arr = headertext.split(" ");
		 int number =Integer.parseInt(arr[2]);
		 return number;
	 }
	 public WebElement firstProduct() {
		 return firstProduct;
	 }
	 
	 public WebElement addToCartBtn() {
		 return addToCartBtn;
	 }
	 
	 public WebElement successNotificationAfterAddToCart() {
		 return successNotificationAfterAddToCart;
	 }
	 }
	

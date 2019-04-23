package TestPackage;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.basePage;
import BasePackage.dressesPageObjects;
import BasePackage.homePageObjects;

public class dressesPageTest {

	dressesPageObjects dp;
	basePage bp;
	homePageObjects homePage;
	Actions ac;
	ArrayList<String> windowlist;
	WebDriver wait;
	
	public dressesPageTest() {
		dp = new dressesPageObjects();
		homePage = new homePageObjects();
		bp = new basePage();
		ac=new Actions(basePage.driver);
		windowlist=new ArrayList<String>();
		
	}
	
	@Test
	public void Checksizeobjects() throws InterruptedException {
	homePage.dressesTab().click();
	//	System.out.println("Clicked");
//	bp.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//	boolean ttt	= bp.elementFound(dp.sCheckBox());
//	//boolean ttt	= dp.sCheckBox().isDisplayed();
//	System.out.println(ttt);
	Assert.assertTrue(bp.elementFound(dp.sCheckBox()), "Faile: S Checkbox is not displayed");
	Assert.assertTrue(bp.elementFound(dp.lCheckBox()), "Faile: L Checkbox is not displayed");
	Assert.assertTrue(bp.elementFound(dp.mCheckBox()), "Faile: M Checkbox is not displayed");
	}
	
	@Test
	public void verifyProductCount() {
		System.out.println(dp.productListCount());
		System.out.println(dp.headerProductCount());
		Assert.assertTrue(dp.productListCount()==dp.headerProductCount(), "Failed: Count Mismatch");
	}
	
	@Test(priority = 1)
	public void addtocart() throws Throwable {
	ac.moveToElement(dp.firstProduct()).click(dp.addToCartBtn()).build().perform();
   	bp.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    String rrr1= dp.successNotificationAfterAddToCart().getText();
    boolean bb = dp.successNotificationAfterAddToCart().isDisplayed();
    System.out.println("print text" + rrr1);
    System.out.println("print text" + bb);
	Assert.assertTrue(bp.elementFound(dp.successNotificationAfterAddToCart()), "Failed: Product is not added to the list");
    //How to read the message displayed in the webelement
	}
	
	
}

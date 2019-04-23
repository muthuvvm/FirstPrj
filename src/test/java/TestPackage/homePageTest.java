package TestPackage;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Random;

import org.testng.Assert;
import BasePackage.basePage;
import BasePackage.homePageObjects;

public class homePageTest {

    homePageObjects homePage;
    basePage bp;

    public homePageTest() {
           homePage = new homePageObjects();
           bp = new basePage();
    }
    
    @Test  //1---Verify women,Dresses and tShirt Tab is dispayed
    public void verifytabs() {
    	Assert.assertTrue(bp.elementFound(homePage.womenTab()), "Failed: Women tab is not Displayed");
    	Assert.assertTrue(bp.elementFound(homePage.dressesTab()), "Failed: Women tab is not Displayed");
    	Assert.assertTrue(bp.elementFound(homePage.tShirtsTab()), "Failed: Women tab is not Displayed");
    }
    
    @Test //Verify corresponding pages has been navigated on selecting these tabs
    public void navigationCheck() {
    	homePage.womenTab().click();
    	String pagCatNamee=homePage.getCatPageName().getText();
    	System.out.println("Clicked on WomenTab "+ pagCatNamee);
    	Assert.assertTrue(pagCatNamee.equals("WOMEN "), "Failed: Women page is not Displayed");
    	
    	homePage.dressesTab().click();
    	pagCatNamee=homePage.getCatPageName().getText();
    	System.out.println("Clicked on DressesTab "+ pagCatNamee);
       	Assert.assertTrue(pagCatNamee.equals("DRESSES "), "Failed: Dresses page is not Displayed");
       	
       	homePage.tShirtsTab().click();
    	pagCatNamee=homePage.getCatPageName().getText();
    	System.out.println("Clicked on TShirtstab "+ pagCatNamee);
       	Assert.assertTrue(pagCatNamee.equals("T-SHIRTS "), "Failed: TShirts page is not Displayed");
    	///Clarification: How to handle the spaces in the compare string 
       	//Thread.
       	//bp.driver.close();
    	
     }
    @Test (priority= 1)//Verify Email Subcription
    public void emailsubcriptionCheck() {
    	int random = new Random().nextInt(5000);
    	String email ="testemail"+random+"@gmail.com";
    	homePage.subscrptionEmail().sendKeys(email);
    	System.out.println(email);
    	homePage.submitNewsletter().click();
    }
}

package upskill.ebay.pageAction;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();                   //Create Object to get the locators from page element class
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);		//Initializing Page factory and driver with locators
	}
	
	public void verifyShoesItems(){
		//Option 1
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		
		//Option 2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtShoes.getText(), "shoes");
		
		//Option 3
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}
	
	public void filterBrand(String brand) throws Exception{
		Thread.sleep(3000);
		if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		}
	}
	
	public void validateBrand(String brand) throws Exception{
		Thread.sleep(3000);
		if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.txtNike.isDisplayed();
		} else if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.txtAdidas.isDisplayed();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.txtUnbranded.isDisplayed();
		}
	}
	
	public void selectShirts(){
		EbaySearchResultLocatorsObj.linkShirtItems.click();
	}
	
	public void switchNewWindow(){
		
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);
		}
		
		/*
		Set<String> AllWindowHandles = SetupDrivers.driver.getWindowHandles();
		String window1 = (String) AllWindowHandles.toArray()[0];
		String window2 = (String) AllWindowHandles.toArray()[1];
		String window3 = (String) AllWindowHandles.toArray()[2];
		SetupDrivers.driver.switchTo().window(window2);
		*/
	}
}
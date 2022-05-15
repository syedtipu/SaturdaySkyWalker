package upskill.ebay.pageAction;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	
	public EbayHomepageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();							//Create Object to get the locators from page element class
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);			//Initializing Page factory and driver with locators
	}
	
	public void loadEbayHomepage() throws Exception {
		SetupDrivers.driver.get("https://www.ebay.com/");
		
		/*
		SetupDrivers.driver.navigate().to("https://www.ebay.com/sl/sell");
		Thread.sleep(5000);
		SetupDrivers.driver.navigate().back();
		Thread.sleep(5000);
		SetupDrivers.driver.navigate().forward(); 
		SetupDrivers.driver.get("https://www.ebay.com/");
		*/
	
		
		//Get Page Title
		
		String title = SetupDrivers.driver.getTitle();
		System.out.println(" >>>>>>>>>>>>>>>>>>> Page Title :: " + title);;
		
		//Get Page URL
		
		String currentUrl = SetupDrivers.driver.getCurrentUrl();
		System.out.println(" >>>>>>>>>>>>>>>>>>> Page Current URL :: " + currentUrl);;
		
		/*
		
		//Implicit Wait - Wait for generic specific time, no matter it will keep waiting
		SetupDrivers.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		//Explicit Wait - Wait until condition match, if condition match will not wait for the declared time
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 20);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[contains(text(),'Daily Deals')]"), " Daily Deals"));	
		
		*/
	}
	
	
	
	public void searchShoes(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");							//Write on Search Textbox
		EbayHomepageLocatorsObj.btnSearch.click();										//Click on the Search Button
	}
	
	public void searchItems(String items){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(items);							//Write on Search Textbox
		EbayHomepageLocatorsObj.btnSearch.click();	
	}
	
	public void mouseHoverMyEbay() throws Exception {
		Actions actions = new Actions (SetupDrivers.driver);
		actions.moveToElement(EbayHomepageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(3000);
	}
	
	public void clickSummary() throws Exception{
		EbayHomepageLocatorsObj.linkSummary.click();
		Thread.sleep(5000);
	}

}
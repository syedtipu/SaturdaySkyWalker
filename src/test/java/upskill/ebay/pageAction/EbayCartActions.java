package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void selectSizeTypeDD() throws Exception{
		Select dropDown = new Select(EbayCartLocatorsObj.ddSizeType);
		dropDown.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
	}
	
	public void selectMenSizeDD() throws Exception{
		Select dropDown = new Select(EbayCartLocatorsObj.ddMenSize);
		//dropDown.selectByVisibleText("4XLT");
		dropDown.selectByIndex(1);
		Thread.sleep(2000);
	}
	
	public void selectShadeDD() throws Exception{
		Select dropDown = new Select(EbayCartLocatorsObj.ddMenShade);
		//dropDown.selectByVisibleText("Black");
		dropDown.selectByValue("13");
		Thread.sleep(2000);
	}
	
	public void selectQuantityTB(){
		EbayCartLocatorsObj.txtbxMenQuantity.sendKeys("2");
	}
	
	public void addtoCart(){
		EbayCartLocatorsObj.btnMenAddToCart.click();
	}

}
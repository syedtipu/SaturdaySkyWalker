package upskill.utilities;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import upskill.ebay.pageElements.EbayCartLocators;

public class AfterActions {
	
	TakeScreenshot TakeScreenshotObj = new TakeScreenshot();
			
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		if(Scenario.isFailed()){
			TakeScreenshotObj.screenShot();
		}
		SetupDrivers.tearDownDriver();
		System.out.println("-------- Test Completed, Browser Closed -------");
	}
}

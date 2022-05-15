package upskill.ebay.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomepageActionsObj.loadEbayHomepage();
	}

	@When("^Search for shoes")
	public void searchshoes(){
		EbayHomepageActionsObj.searchShoes();
	}
	
	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItems(items);
	}
	
	@When("^Search for shirt$")
	public void search_for_shirt() throws Throwable {
		EbayHomepageActionsObj.searchItems("Big & Tall Cotton Tee");
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionsObj.mouseHoverMyEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionsObj.clickSummary();
	}

}

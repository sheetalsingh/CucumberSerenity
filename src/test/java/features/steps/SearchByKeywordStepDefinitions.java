package features.steps;

import cucumber.api.java.en.*;
import features.steps.serenity.BuyerSteps;
import net.thucydides.core.annotations.Steps;

public class SearchByKeywordStepDefinitions {
	@Steps
    BuyerSteps buyer;

    @Given("I want to buy a (.*)")
    public void buyerWantsToBuy(String article) {
        buyer.opens_etsy_home_page();
    }

    @When("I search for items containing '(.*)'")
    public void searchByKeyword(String keyword) {
        buyer.searches_for_items_containing(keyword);
    }

    @Then("I should only see items related to '(.*)'")
    public void resultsForACategoryAndKeywordInARegion(String keyword) {
        buyer.should_see_items_related_to(keyword);
    }
    
    @Then("I am a boy")
    public void abc() {
    	//
    }
}

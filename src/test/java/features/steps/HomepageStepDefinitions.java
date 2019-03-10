package features.steps;

import cucumber.api.java.en.*;
import features.steps.serenity.HomeSteps;
import net.thucydides.core.annotations.Steps;

public class HomepageStepDefinitions {
	@Steps
	HomeSteps home;
	

	@Given("I am on home page")
	public void iamonhomepage() {
		System.out.println("Home Step Def: Given");
		home.test1();
	}

	@When("I search for items all")
	public void isearchforitems() {
		System.out.println("Home Step Def: When");
		home.test2();
	}

	@Then("I should see all results")
	public void ishdseeallresults() {
		System.out.println("Home Step Def: Then");
		home.test3();
	}

}

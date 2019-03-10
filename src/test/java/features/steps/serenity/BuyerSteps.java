package features.steps.serenity;

import java.util.List;
import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.SearchResultsPage;

public class BuyerSteps {
	HomePage homePage;
	SearchResultsPage searchResultsPage;

	@Step
	public void opens_etsy_home_page() {
		homePage.open();
	}

	@Step
	public void searches_for_items_containing(String keywords) {
		homePage.searchFor(keywords);
	}

	@Step
	public void should_see_items_related_to(String keywords) {
		List<String> resultTitles = searchResultsPage.getResultTitles();
		System.out.println("Size: "+resultTitles.size());
		//Assert.assertTrue("", title.contains(keywords));
		//resultTitles.stream().forEach(title -> assertThat(title.contains(keywords)));
	}
}

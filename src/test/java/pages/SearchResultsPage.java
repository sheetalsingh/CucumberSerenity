package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class SearchResultsPage extends PageObject {

    @FindBy(css=".listing-card")
    List<WebElement> listingCards;

    public List<String> getResultTitles() {
        return listingCards.stream()
                .map(element -> element.getText())
                .collect(Collectors.toList());
    }
}

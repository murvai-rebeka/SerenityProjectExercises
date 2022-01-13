package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultPage;

public class HomePageSearchSteps extends ScenarioSteps {
    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void enterSearchText(String text) {
        homePage.setSearchField(text);
        homePage.clickSearchButton();
    }

    @Step
    public void checkHasResult() {
        searchResultPage.checkHasResult();
    }
}

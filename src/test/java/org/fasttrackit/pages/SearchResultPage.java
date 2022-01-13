package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class SearchResultPage extends PageObject {
    @FindBy(css = "#search_results h2")
    private WebElementFacade searchResult;

    public void checkHasResult(){
        searchResult.shouldContainText("produse");
        searchResult.shouldNotContainText("0");
    }
}

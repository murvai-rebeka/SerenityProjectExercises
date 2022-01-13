package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

//todo
//1 extend
//2 login link
//3 click on login link
@DefaultUrl("https://www.obio.ro/")
public class HomePage extends PageObject {

    @FindBy(css = "[title='Contul meu']")
    private WebElementFacade accountLink;

    public void clickAccountLink() {
        clickOn(accountLink);
    }

    @FindBy(css = "[name='search_value']")
    private WebElementFacade searchInput;

    public void setSearchField(String text) {
        waitFor(searchInput);
        typeInto(searchInput, text);
    }

    @FindBy(css = ".mid-header .search-wrapper button")
    private WebElementFacade searchButton;

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    @FindBy(css = ".homepage_products_group a")
    private WebElementFacade firstProduct;

    public void clickOnFirstProduct() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(firstProduct).click().perform();
        //clickOn(firstProduct);
    }

    @FindBy(css = "[name='nl_user_firstname']")
    private WebElementFacade newsletterNameInput;

    @FindBy(css = "[name='nl_user_email']")
    private WebElementFacade newsletterEmailInput;

    @FindBy(css = ".nl_subscribe_submit ")
    private WebElementFacade newsletterSubscribeButton;

    public void setNewsletterNameAndEmail(String name, String email) {
        waitFor(newsletterNameInput);
        typeInto(newsletterNameInput, name);
        waitFor(newsletterEmailInput);
        typeInto(newsletterEmailInput, email);
    }

    public void clickOnNewsletterSubscribeButton() {
        clickOn(newsletterSubscribeButton);
    }

    @FindBy(css = "#nl_confirm h2")
    private WebElementFacade newsletterValidationText;

    public void checkNewsletterValidationText() {
        newsletterValidationText.shouldContainText("Vă rugăm confirmați abonarea");
    }


}

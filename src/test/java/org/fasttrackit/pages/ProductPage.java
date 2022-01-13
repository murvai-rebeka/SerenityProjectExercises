package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {
    @FindBy(css = ".add-to-basket-btn")
    private WebElementFacade addToCartButton;

    public void clickAddToCartButton() {
        clickOn(addToCartButton);

    }

    @FindBy(css = "#added_product #ap-title")
    private WebElementFacade addToCartMessage;

    public void checkAddToCart() {
        addToCartMessage.shouldContainText("Produsul a fost adaugat in cos");
    }

}

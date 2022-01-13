package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.SearchResultPage;

public class CartSteps extends ScenarioSteps {
    private HomePage homePage;
    private ProductPage productPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void navigateToFirstProduct() {
        homePage.clickOnFirstProduct();
    }

    @Step
    public void addToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkAddToCart() {
        productPage.checkAddToCart();
    }
}

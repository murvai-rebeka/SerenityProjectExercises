package org.fasttrackit.features.search;

import org.fasttrackit.steps.serenity.CartSteps;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void addToCartTest() {
        cartSteps.navigateToHomepage();
        cartSteps.navigateToFirstProduct();
        cartSteps.addToCart();
        cartSteps.checkAddToCart();
    }

}

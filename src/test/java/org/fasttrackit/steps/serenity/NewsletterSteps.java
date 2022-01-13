package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;

public class NewsletterSteps extends ScenarioSteps {
    private HomePage homePage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void submitNewsletter(String name, String email) {
        homePage.setNewsletterNameAndEmail(name, email);
        homePage.clickOnNewsletterSubscribeButton();
    }

    @Step
    public void checkValidationMsg() {
        homePage.checkNewsletterValidationText();

    }

}

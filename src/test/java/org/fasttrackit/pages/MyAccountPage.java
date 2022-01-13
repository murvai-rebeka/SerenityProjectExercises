package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends PageObject {

    @FindBy(css=".section-title span")
    private WebElementFacade loginWelcomeMessage;

    public void checkUserLoggedIn(String userName){
        loginWelcomeMessage.shouldContainOnlyText("ADMINISTRARE CONT - "+ userName);
    }



}

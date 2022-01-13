package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class LoginPage extends PageObject {
    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "parola")
    private WebElementFacade passwordField;

    @FindBy(css=".form-group button")
    private WebElementFacade loginButton;


    public void setEmailField(String email){
        waitFor(emailField);
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }
}

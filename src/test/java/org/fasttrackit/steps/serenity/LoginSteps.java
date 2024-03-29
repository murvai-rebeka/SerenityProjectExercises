package org.fasttrackit.steps.serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.MyAccountPage;

public class LoginSteps extends ScenarioSteps{

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }
    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();

    }
    @Step
    public void enterCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String userName){
        myAccountPage.checkUserLoggedIn(userName);
    }
}

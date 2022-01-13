package org.fasttrackit.features.search;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.enterCredentials("murvai.rebeka@gmail.com","bellaR93");
        loginSteps.clickLogin();
        loginSteps.checkUserIsLoggedIn("REBEKA MURVAI");
    }

}


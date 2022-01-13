package org.fasttrackit.features.search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.CartSteps;
import org.fasttrackit.steps.serenity.HomePageSearchSteps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.NewsletterSteps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
    }

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected HomePageSearchSteps homePageSearchSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected NewsletterSteps newsletterSteps;

}

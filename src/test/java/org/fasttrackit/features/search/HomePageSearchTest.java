package org.fasttrackit.features.search;
import org.junit.Test;

public class HomePageSearchTest extends BaseTest{

    @Test
    public void searchTest(){
       homePageSearchSteps.navigateToHomepage();
       homePageSearchSteps.enterSearchText("cocos");
       homePageSearchSteps.checkHasResult();
    }
}

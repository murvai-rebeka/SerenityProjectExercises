package org.fasttrackit.features.search;

import org.junit.Test;

public class NewsletterTest extends BaseTest {

    @Test
    public void newsletterSubscribeTest() {
        newsletterSteps.navigateToHomepage();
        newsletterSteps.submitNewsletter("Murvai Rebeka", "murvai@mailinator.com");
        newsletterSteps.checkValidationMsg();

    }
}

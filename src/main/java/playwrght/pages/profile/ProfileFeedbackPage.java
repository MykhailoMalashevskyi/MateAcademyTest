package playwrght.pages.profile;

import com.microsoft.playwright.Page;
import playwrght.locators.profile.ProfileFeedbackLocators;
import playwrght.pages.BasePage;

public class ProfileFeedbackPage extends BasePage {

    public ProfileFeedbackPage(Page page) {
        super(page);
    }

    public void verifySignUpPassed() {
        page.locator(ProfileFeedbackLocators.PROFILE_CREATED_SUCCESSFULLY_XPATH).isVisible();
    }
}

package playwrght.pages.profile;

import com.microsoft.playwright.Page;
import playwrght.locators.profile.ProfilePreviewLocators;
import playwrght.pages.BasePage;

public class ProfilePreviewPage extends BasePage {

    public ProfilePreviewPage(Page page) {
        super(page);
    }

    public void verifyUserAuthorized() {
        page.locator(ProfilePreviewLocators.AUTOMATION_QA_TITLE_XPATH).isVisible();
        page.locator(ProfilePreviewLocators.ACHIEVEMENTS_CATEGORY_XPATH).isVisible();
        page.locator(ProfilePreviewLocators.TECHNICAL_SKILLS_XPATH).isVisible();
    }

    public void verifySignInFailed(String expectedLocator) {
        page.locator(expectedLocator).isVisible();
    }
}

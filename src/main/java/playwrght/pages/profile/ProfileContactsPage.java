package playwrght.pages.profile;

import com.microsoft.playwright.Page;
import playwrght.locators.profile.ProfileContactsLocators;
import playwrght.pages.BasePage;

public class ProfileContactsPage extends BasePage {

    public ProfileContactsPage(Page page) {
        super(page);
    }

    public ProfileFeedbackPage addContactInfo(String firstName, String lastName) {
        page.fill(ProfileContactsLocators.FIRST_NAME_FIELD_XPATH, firstName);
        page.fill(ProfileContactsLocators.LAST_NAME_FIELD_XPATH, lastName);
        page.click(ProfileContactsLocators.ACTIVATE_PROFILE_BTN_XPATH);
        return new ProfileFeedbackPage(page);
    }
}

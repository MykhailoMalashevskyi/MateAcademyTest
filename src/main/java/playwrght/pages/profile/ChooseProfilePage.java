package playwrght.pages.profile;

import com.microsoft.playwright.Page;
import playwrght.locators.profile.ChooseProfileLocators;
import playwrght.pages.BasePage;

public class ChooseProfilePage extends BasePage {
    public ChooseProfilePage(Page page) {
        super(page);
    }

    public ProfilePage chooseProfile() {
        page.click(ChooseProfileLocators.CANDIDATES_BTN_XPATH);
        return new ProfilePage(page);
    }

    public void verifyActionFailed(String expectedLocator) {
        page.locator(expectedLocator).isVisible();
    }
}

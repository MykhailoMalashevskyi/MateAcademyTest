package playwrght.pages;

import com.microsoft.playwright.Page;
import playwrght.locators.SignInLocators;
import playwrght.pages.profile.ProfilePreviewPage;

public class SignInPage extends BasePage{

    public SignInPage(Page page) {
        super(page);
    }

    public ProfilePreviewPage authorizeUser(String email, String password) {
        page.fill(SignInLocators.EMAIL_FIELD_CSS, email);
        page.fill(SignInLocators.PASSWORD_FIELD_CSS, password);
        page.click(SignInLocators.SUBMIT_BTN_CSS);
        return new ProfilePreviewPage(page);
    }
}

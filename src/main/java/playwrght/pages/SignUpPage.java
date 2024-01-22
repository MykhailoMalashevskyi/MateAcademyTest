package playwrght.pages;

import com.microsoft.playwright.Page;
import playwrght.locators.SignUpLocators;
import playwrght.pages.profile.ChooseProfilePage;

public class SignUpPage extends BasePage{

    public SignUpPage(Page page) {
        super(page);
    }

    public ChooseProfilePage createUser(String email, String password) {
        page.fill(SignUpLocators.EMAIL_FIELD_XPATH, email);
        page.fill(SignUpLocators.PASSWORD_FIELD_XPATH, password);
        page.fill(SignUpLocators.REPEAT_PASSWORD_FIELD_XPATH, password);
        page.click(SignUpLocators.CREATE_ACCOUNT_BTN_XPATH);
        return new ChooseProfilePage(page);
    }
}

package playwrght.pages;

import com.microsoft.playwright.Page;
import playwrght.locators.HomeLocators;
import provider.ConfigProvider;

public class HomePage extends BasePage{
    public HomePage(Page page) {
        super(page);
    }

    public HomePage open() {
        page.navigate(ConfigProvider.URL_MANAGER.getHuntdUrl());
        return this;
    }

    public SignUpPage openSignUp() {
        page.click(HomeLocators.SIGN_UP_BTN_XPATH);
        return new SignUpPage(page);
    }

    public SignInPage openSignIn() {
        page.click(HomeLocators.SIGN_IN_BTN_XPATH);
        return new SignInPage(page);
    }
}

package playwrght.pages;

import com.microsoft.playwright.Page;

public class BasePage {
    public final Page page;

    public BasePage(Page page) {
        this.page = page;
    }
}

package playwrght;

import com.microsoft.playwright.Page;

public class DropdownHelper {
    public static void selectDropdown(Page page, String dropdownLocator, String value) {
        String optionPatternXpath = "//div[contains(@class,'select__menu css')]//div[contains(@id, 'react-select-') and text()='%s']";
        String optionXpath = String.format(optionPatternXpath, value);

        page.locator(dropdownLocator).waitFor();
        page.click(dropdownLocator);
        page.click(optionXpath);
    }

    public static void selectSearchDropdown(Page page, String dropdownLocator, String value) {
        String optionPatternXpath = "//div[contains(@class,'select__menu css')]//div[contains(@id, 'react-select-') and text()='%s']";
        String optionXpath = String.format(optionPatternXpath, value);

        page.fill(dropdownLocator, value);
        page.click(optionXpath);
    }

    public static void selectByTextDropdown(Page page, String dropdownLocator, String value) {
        page.fill(dropdownLocator, value);
        page.getByText(value, new Page.GetByTextOptions().setExact(true)).nth(1).click();
    }
}


package playwrght.locators.profile;

public class ProfileLocators {

    // Role step
    public static final String POSITION_FIELD_XPATH = "//input[@id='position']";
    public static final String PLUS_ICON_BTN_CSS = "[class='icons_icon__WARHB icon-plus']";
    public static final String MINUS_ICON_BTN_CSS = "[class='icons_icon__WARHB icon-minus']";
    public static final String TECHNOLOGIES_DROPDOWN_XPATH = "[id='technologies']";
    public static final String SAVE_BTN_XPATH = "//span[text()='Save and continue']";

    // Expectations step
    public static final String SALARY_FIELD_XPATH = "//input[@placeholder='Desired salary in $']";
    public static final String JOB_EXPERIENCE_DROPDOWN_XPATH = "//label[@for='job-experience']/parent::div//div[contains(@class,'select__indicators')]";
    public static final String CITY_DROPDOWN_XPATH = "//label[@for='location']/parent::div//input[@placeholder='Enter a location']";
    public static final String ENGLISH_LEVEL_DROPDOWN_XPATH = "//label[@for='english-level']/parent::div//div[contains(@class,'select__indicators')]";
    public static final String SAVE_AND_CONTINUE_XPATH = "//span[text()='Save and continue']";

    // Experience step
    public static final String SAVE_AND_CONTINUE = "//span[text()='Save and continue']";
    public static final String ADD_MANUALLY_BTN_XPATH = "//span[text()='Add manually']";
    public static final String COMPANY_NAME_FIELD_XPATH = "//input[@id='companyName']";
    public static final String MONTH_DROPDOWN_XPATH = "//div[text()='Month']";
    public static final String START_DATE_FIELD_XPATH = "//input[@name='startYear']";
    public static final String ROLE_FIELD_XPATH = "//input[@id='title']";
    public static final String SAVE_EXPERIENCE_BTN_XPATH = "//span[text()='Save']";

    // Role step
    public static final String ACHIEVEMENTS_TEXTAREA_XPATH = "//textarea[@id='achievements']";
    public static final String WORK_EXPECTATIONS_TEXTAREA_XPATH = "//textarea[@id='workExpectations']";
}

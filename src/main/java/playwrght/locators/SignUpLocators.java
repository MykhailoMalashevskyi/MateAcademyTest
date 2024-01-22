package playwrght.locators;

public class SignUpLocators {
    private static final String AUTH_WRAPPER_CONTAINER_XPATH = "//div[contains(@class, 'AuthForm_authFormWrapper')]";
    public static final String EMAIL_FIELD_XPATH = AUTH_WRAPPER_CONTAINER_XPATH.concat("//input[@id='email']");
    public static final String PASSWORD_FIELD_XPATH = AUTH_WRAPPER_CONTAINER_XPATH.concat("//input[@id='password']");
    public static final String REPEAT_PASSWORD_FIELD_XPATH = AUTH_WRAPPER_CONTAINER_XPATH.concat("//input[@id='repeatPassword']");
    public static final String CREATE_ACCOUNT_BTN_XPATH = AUTH_WRAPPER_CONTAINER_XPATH.concat("//span[text()='Create account']");
}

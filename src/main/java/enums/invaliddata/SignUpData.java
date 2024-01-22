package enums.invaliddata;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import playwrght.locators.profile.ProfilePreviewLocators;

@Getter
@RequiredArgsConstructor
public enum SignUpData {
    EMPTY_EMAIL("", "", ProfilePreviewLocators.EMAIL_IS_EMPTY_MESSAGE_XPATH),
    EMPTY_PASSWORD("validemail@example.com", "", ProfilePreviewLocators.PASSWORD_IS_REQUIRED_XPATH),
    INVALID_EMAIL("testuser", "12345678", ProfilePreviewLocators.WRONG_EMAIL_MESSAGE_XPATH);

    private final String email;
    private final String password;
    private final String message;
}

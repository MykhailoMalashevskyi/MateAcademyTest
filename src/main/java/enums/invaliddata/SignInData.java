package enums.invaliddata;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import playwrght.locators.profile.ProfilePreviewLocators;

@Getter
@RequiredArgsConstructor
public enum SignInData {
    INVALID_EMAIL("cvbcvb", "12345678", ProfilePreviewLocators.WRONG_EMAIL_MESSAGE_XPATH),
    WRONG_PASSWORD("mateAcademyTest@gmail.com", "1", ProfilePreviewLocators.WRONG_CREDENTIALS_MESSAGE_XPATH),
    BOTH_INCORRECT("cvbcvb", "d", ProfilePreviewLocators.WRONG_EMAIL_MESSAGE_XPATH),
    EMPTY_FIELDS("", "", ProfilePreviewLocators.EMAIL_IS_EMPTY_MESSAGE_XPATH);

    private final String email;
    private final String password;
    private final String message;
}

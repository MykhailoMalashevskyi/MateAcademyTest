package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DesiredRoles {
    DEVOPS("DEVOPS"),
    FULL_STACK("FULL STACK"),
    FRONTEND("FRONTEND"),
    MOBILE("MOBILE"),
    BACKEND("BACKEND"),
    QA("QA"),
    UI_UX_DESIGN("UI/UX DESIGN"),
    DATA_SCIENCE("DATA SCIENCE");

    private final String value;
}
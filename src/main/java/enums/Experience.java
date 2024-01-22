package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Experience {
    ONE_THREE_YEARS("1-3 years"),
    THREE_FIVE_YEARS("3-5 years"),
    MORE_THAN_FIVE_YEARS("5+ years");

    private final String value;
}

package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EnglishLevel {
    ELEMENTARY("Elementary"),
    PRE_INTERMEDIATE("Pre intermediate"),
    INTERMEDIATE("Intermediate"),
    UPPER_INTERMEDIATE("Upper intermediate"),
    ADVANCED("Advanced");

    private final String value;
}

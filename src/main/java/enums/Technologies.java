package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Technologies {
    TECHNOLOGIES("JavaScript", "TypeScript", "Selenium", "Dart", "MySQL");

    private final String javaScript;
    private final String typeScript;
    private final String selenium;
    private final String dart;
    private final String mySql;
}

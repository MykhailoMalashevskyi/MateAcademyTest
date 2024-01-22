package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum Position {
    QA_POSITION("Automation QA"),
    SENIOR_JAVA_ENGINEER("Senior Java Engineer"),
    DEVOPS("DevOps");

    private final String value;
}

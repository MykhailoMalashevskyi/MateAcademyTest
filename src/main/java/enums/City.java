package enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum City {
    CHERNIHIV("Chernihiv"),
    TERNOPIL("Ternopil"),
    IVANO_FRANKIVSK("Ivano-Frankivsk"),
    UZHHOROD("Uzhhorod");

    private final String value;
}

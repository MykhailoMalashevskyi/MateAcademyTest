package dto;

import enums.City;
import enums.EnglishLevel;
import enums.Experience;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddExpectationsModal {
    private String salary;
    private City city;
    private Experience experience;
    private EnglishLevel english;

}

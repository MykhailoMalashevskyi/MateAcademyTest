package dto;

import enums.DesiredRoles;
import enums.Month;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddExperienceModal {
    private String company;
    private Month month;
    private String year;
    private DesiredRoles role;

}

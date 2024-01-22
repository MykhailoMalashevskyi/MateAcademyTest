package dto;

import enums.DesiredRoles;
import enums.Position;
import enums.Technologies;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddRolesModal {
    private Position position;
    private DesiredRoles role;
    private Technologies technologies;

}

package co.com.coding.together.mapstruct;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PersonRequest {

    private String idPerson;
    private String name;
    private Integer personAge;

}

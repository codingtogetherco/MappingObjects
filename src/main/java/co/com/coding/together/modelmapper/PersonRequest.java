package co.com.coding.together.modelmapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dozer.Mapping;

@Setter
@Getter
@NoArgsConstructor
public class PersonRequest {

    private String idPerson;
    private String name;
    private Integer personAge;

}

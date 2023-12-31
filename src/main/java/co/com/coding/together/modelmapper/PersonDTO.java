package co.com.coding.together.modelmapper;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonDTO {

    private String idPerson;
    private String name;
    private Integer age;
}

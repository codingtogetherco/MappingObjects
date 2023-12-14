package co.com.coding.together.dozer;

import lombok.*;
import org.dozer.Mapping;

@Getter
@Setter
@NoArgsConstructor
public class PersonDTO {

    private String idPerson;
    private String name;
    @Mapping("personAge")
    private Integer age;
}

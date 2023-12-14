package co.com.coding.together.api;

import co.com.coding.together.dozer.PersonDTO;
import co.com.coding.together.dozer.PersonRequest;
import co.com.coding.together.dozer.DozerService;
import co.com.coding.together.mapstruct.MapStructService;
import co.com.coding.together.modelmapper.ModelMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/person")
public class RestController {

    @Autowired
    private DozerService dozerService;
    @Autowired
    private ModelMapperService modelService;

    @Autowired
    private MapStructService mapStructService;

    @GetMapping("/dozer")
    public ResponseEntity<PersonDTO> getDozerMapping() {
        PersonRequest person = new PersonRequest();
        person.setIdPerson("123");
        person.setName("Andrea");
        person.setPersonAge(15);
        PersonDTO personDTO = dozerService.mapPersonRequestToPersonDTO(person);
        return ResponseEntity.ok(personDTO);
    }

    @GetMapping("/model-mapper")
    public ResponseEntity<co.com.coding.together.modelmapper.PersonDTO> getModelMapping() {
        co.com.coding.together.modelmapper.PersonRequest person = new co.com.coding.together.modelmapper.PersonRequest();
        person.setIdPerson("123");
        person.setName("Andrea");
        person.setPersonAge(15);
        co.com.coding.together.modelmapper.PersonDTO personDTO = modelService.mapPersonRequestToPersonDTO(person);
        return ResponseEntity.ok(personDTO);
    }

    @GetMapping("/map-struct")
    public ResponseEntity<co.com.coding.together.mapstruct.PersonDTO> getMapStructMapping() {
        co.com.coding.together.mapstruct.PersonRequest person = new co.com.coding.together.mapstruct.PersonRequest();
        person.setIdPerson("123");
        person.setName("Andrea");
        person.setPersonAge(15);
        co.com.coding.together.mapstruct.PersonDTO personDTO = mapStructService.mapPersonRequestToPersonDTO(person);
        return ResponseEntity.ok(personDTO);
    }
}

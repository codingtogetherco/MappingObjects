package co.com.coding.together.mapstruct;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T20:44:56-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public PersonDTO mapPersonRequestToPersonDTO(PersonRequest personRequest) {
        if ( personRequest == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setAge( personRequest.getPersonAge() );
        personDTO.setIdPerson( personRequest.getIdPerson() );
        personDTO.setName( personRequest.getName() );

        return personDTO;
    }
}

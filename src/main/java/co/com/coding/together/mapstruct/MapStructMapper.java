package co.com.coding.together.mapstruct;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper {

    MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

    @Mapping(source = "personAge", target = "age")
    PersonDTO mapPersonRequestToPersonDTO(PersonRequest personRequest);

}

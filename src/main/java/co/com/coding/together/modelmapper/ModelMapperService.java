package co.com.coding.together.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperService {

    private final ModelMapper modelMapper;

    @Autowired
    public ModelMapperService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PersonDTO mapPersonRequestToPersonDTO(PersonRequest personRequest) {
        return modelMapper.map(personRequest, PersonDTO.class);
    }
}
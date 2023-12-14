package co.com.coding.together.mapstruct;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapStructService {

    private final MapStructMapper mapStructMapper;

    @Autowired
    public MapStructService(MapStructMapper mapStructMapper) {
        this.mapStructMapper = mapStructMapper;
    }
    public PersonDTO mapPersonRequestToPersonDTO (PersonRequest personRequest) {
        return mapStructMapper.mapPersonRequestToPersonDTO(personRequest);
    }
}

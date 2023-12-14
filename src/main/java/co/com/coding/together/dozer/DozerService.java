package co.com.coding.together.dozer;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DozerService {

    private final DozerBeanMapper dozerMapper;

    @Autowired
    public DozerService(DozerBeanMapper dozerMapper) {
        this.dozerMapper = dozerMapper;
    }

    public PersonDTO mapPersonRequestToPersonDTO (PersonRequest personRequest) {
        return dozerMapper.map(personRequest, PersonDTO.class);
    }
}

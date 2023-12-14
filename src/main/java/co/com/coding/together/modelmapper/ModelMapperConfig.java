package co.com.coding.together.modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

//    @Bean
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<PersonRequest, PersonDTO>() {
            @Override
            protected void configure() {
                //Aquí agregar el mapeo para los atributos con nombres muy diferentes
                map().setAge(source.getPersonAge());
            }
        });

        return modelMapper;
    }
}
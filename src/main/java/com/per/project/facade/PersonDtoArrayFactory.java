package com.per.project.facade;

import com.per.project.facade.dto.PersonDto;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.ObjectFactory;

public class PersonDtoArrayFactory implements ObjectFactory<PersonDto[]> {
    @Override
    public PersonDto[] create(Object o, MappingContext mappingContext) {
        return new PersonDto[1];
    }
}

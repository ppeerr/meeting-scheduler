package com.per.project.service;

import com.per.project.facade.dto.PersonDto;
import com.per.project.service.entity.PersonEntity;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class PersonMapper {

    private final static MapperFacade mapper;

    static {
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(PersonEntity.class, PersonDto.class)
                .byDefault().register();
        mapper = mapperFactory.getMapperFacade();
    }


    public PersonDto mapPersonEntityToPersonDto(final PersonEntity personEntity) {
        return mapper.map(personEntity, PersonDto.class);
    }
}

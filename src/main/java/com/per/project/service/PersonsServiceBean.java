package com.per.project.service;

import com.per.project.facade.dto.PersonDto;
import com.per.project.service.entity.PersonEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

@Stateless
public class PersonsServiceBean implements PersonsService {

    private static final PersonMapper personMapper = new PersonMapper();

    @PersistenceContext
    private EntityManager entityManager;

    public List<PersonDto> getAll() {
        PersonEntity person = entityManager.find(PersonEntity.class, 1);

        PersonDto personDto = personMapper.mapPersonEntityToPersonDto(person);
        return Collections.singletonList(personDto);
    }

    public PersonDto getPerson(Integer personId) {
        PersonEntity person = entityManager.find(PersonEntity.class, personId);

        PersonDto personDto = personMapper.mapPersonEntityToPersonDto(person);
        return personDto;
    }
}

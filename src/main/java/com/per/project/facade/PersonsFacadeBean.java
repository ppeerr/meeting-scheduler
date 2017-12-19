package com.per.project.facade;

import com.per.project.facade.dto.*;
import com.per.project.service.PersonsService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class PersonsFacadeBean implements PersonsFacade {

    private static final TestToMapMapper testToMapMapper = new TestToMapMapper();

    @Inject
    private PersonsService personsService;

    public List<PersonDto> getAll() {
        return personsService.getAll();
    }

    public PersonDto getPerson(Integer personId) {
        return personsService.getPerson(personId);
    }
}

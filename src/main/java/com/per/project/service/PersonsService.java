package com.per.project.service;

import com.per.project.facade.dto.PersonDto;

import java.util.List;

public interface PersonsService {

    /**
     *
     * @return
     * @throws Exception
     */
    List<PersonDto> getAll();

    /**
     *
     * @param personId
     * @return
     */
    PersonDto getPerson(Integer personId);

}

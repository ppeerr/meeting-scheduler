package com.per.project.facade;

import com.per.project.facade.dto.PersonDto;

import java.util.List;

public interface PersonsFacade {

    /**
     *
     * @return
     */
    List<PersonDto> getAll();

    /**
     *
     * @param personId
     * @return
     */
    PersonDto getPerson(Integer personId);

}

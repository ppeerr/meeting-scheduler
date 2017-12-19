package com.per.project.facade;

import com.per.project.facade.dto.PersonDto;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDtoToIntegerConverter extends BidirectionalConverter<PersonDto[], List<Integer>> {

    public List<Integer> convertTo(PersonDto[] personDtos, Type<List<Integer>> type) {
        return Arrays.stream(personDtos).map(PersonDto::getId).collect(Collectors.toList());
    }

    public PersonDto[] convertFrom(List<Integer> integers, Type<PersonDto[]> type) {
        return integers.stream().map(integer -> {
            PersonDto person = new PersonDto();
            person.setId(integer);
            return person;
        }).toArray(PersonDto[]::new);
    }
}

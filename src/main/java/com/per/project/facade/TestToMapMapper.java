package com.per.project.facade;

import com.per.project.facade.dto.MapDto;
import com.per.project.facade.dto.PersonDto;
import com.per.project.facade.dto.TestDto;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.TypeFactory;

public class TestToMapMapper {

    private final static MapperFacade mapper;

    static {
        final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        ConverterFactory converterFactory = mapperFactory.getConverterFactory();
        converterFactory.registerConverter("myConverterIdValue", new PersonDtoToIntegerConverter());

        //FIXME strange
        mapperFactory.registerObjectFactory(new PersonDtoArrayFactory(), TypeFactory.valueOf(PersonDto[].class));

        mapperFactory.classMap(TestDto.class, MapDto.class).mapNulls(false).mapNullsInReverse(false)
                .field("contract.title", "contractTitle")
                .field("parentOrganization.chairPerson", "parentOrganizationChairPerson")
                .field("persons[0].name", "onePersonName")
                .fieldMap("persons", "personIds").converter("myConverterIdValue").add()
                .byDefault().register();

        mapper = mapperFactory.getMapperFacade();
    }

    public MapDto mapTestToMap(TestDto testDto) {
        return mapper.map(testDto, MapDto.class);
    }

    public TestDto mapMapToTest(MapDto mapDto) {
        return mapper.map(mapDto, TestDto.class);
    }

}

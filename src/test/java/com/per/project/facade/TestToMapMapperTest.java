package com.per.project.facade;

import com.per.project.facade.dto.*;
import org.junit.Test;

import java.util.Arrays;

public class TestToMapMapperTest {

    private TestToMapMapper testToMapMapper = new TestToMapMapper();

    @Test
    public void mapTestToMap() {
        ContractDto contract = new ContractDto();
        contract.setTitle("42th title");

        PersonDto chairPerson = new PersonDto();
        chairPerson.setId(42);
        chairPerson.setName("Name");

        PersonDto somePerson = new PersonDto();
        somePerson.setId(4242);
        somePerson.setName("FullName");

        OrganizationDto organization = new OrganizationDto();
        organization.setChairPerson(chairPerson);

        OrganizationDto someOrganization = new OrganizationDto();
        someOrganization.setChairPerson(somePerson);

        TestDto testDto = new TestDto();
        testDto.setContract(contract);
        testDto.setParentOrganization(organization);
        testDto.setPersons(new PersonDto[] {somePerson, chairPerson});
        testDto.setOrganizations(new OrganizationDto[]{organization, someOrganization});

        MapDto mapDto = testToMapMapper.mapTestToMap(testDto);

        System.out.print(mapDto);
    }

    @Test
    public void mapMapToTest() {
        OrganizationDto organization = new OrganizationDto();
        organization.setOrgName("OrgName");

        OrganizationDto someOrganization = new OrganizationDto();
        someOrganization.setOrgName("OrgName");

        PersonDto personDto = new PersonDto();
        personDto.setId(12);
        personDto.setName("name");

        MapDto mapDto = new MapDto();
        mapDto.setContractTitle("Very good title");
        mapDto.setOnePersonName("The worst name ever");
        mapDto.setOrganizations(Arrays.asList(organization, someOrganization));
        mapDto.setParentOrganizationChairPerson(personDto);
        mapDto.setPersonIds(Arrays.asList(1,1,2,3,5,8,13));

        TestDto testDto = testToMapMapper.mapMapToTest(mapDto);

        System.out.print(testDto);
    }
}
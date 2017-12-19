package com.per.project.facade.dto;

import java.util.Arrays;

public class TestDto {

    private PersonDto[] persons;

    private OrganizationDto parentOrganization;

    private OrganizationDto[] organizations;

    private ContractDto contract;


    public PersonDto[] getPersons() {
        return persons;
    }

    public void setPersons(PersonDto[] persons) {
        this.persons = persons;
    }

    public OrganizationDto getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(OrganizationDto parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public OrganizationDto[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(OrganizationDto[] organizations) {
        this.organizations = organizations;
    }

    public ContractDto getContract() {
        return contract;
    }

    public void setContract(ContractDto contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "TestDto{" +
                "persons=" + Arrays.toString(persons) +
                ", parentOrganization=" + parentOrganization +
                ", organizations=" + Arrays.toString(organizations) +
                ", contract=" + contract +
                '}';
    }
}

package com.per.project.facade.dto;

import java.util.List;

public class MapDto {

    private String contractTitle;

    private String onePersonName;

    private List<OrganizationDto> organizations;

    private PersonDto parentOrganizationChairPerson;

    private List<Integer> personIds;

    public String getContractTitle() {
        return contractTitle;
    }

    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    public String getOnePersonName() {
        return onePersonName;
    }

    public void setOnePersonName(String onePersonName) {
        this.onePersonName = onePersonName;
    }

    public List<OrganizationDto> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<OrganizationDto> organizations) {
        this.organizations = organizations;
    }

    public PersonDto getParentOrganizationChairPerson() {
        return parentOrganizationChairPerson;
    }

    public void setParentOrganizationChairPerson(PersonDto parentOrganizationChairPerson) {
        this.parentOrganizationChairPerson = parentOrganizationChairPerson;
    }

    public List<Integer> getPersonIds() {
        return personIds;
    }

    public void setPersonIds(List<Integer> personIds) {
        this.personIds = personIds;
    }

    @Override
    public String toString() {
        return "MapDto{" +
                "contractTitle='" + contractTitle + '\'' +
                ", onePersonName='" + onePersonName + '\'' +
                ", organizations=" + organizations +
                ", parentOrganizationChairPerson=" + parentOrganizationChairPerson +
                ", personIds=" + personIds +
                '}';
    }
}

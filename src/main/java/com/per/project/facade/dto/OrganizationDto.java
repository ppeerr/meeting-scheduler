package com.per.project.facade.dto;

public class OrganizationDto {

    private String orgName;

    private PersonDto chairPerson;


    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public PersonDto getChairPerson() {
        return chairPerson;
    }

    public void setChairPerson(PersonDto chairPerson) {
        this.chairPerson = chairPerson;
    }

    @Override
    public String toString() {
        return "OrganizationDto{" +
                "orgName='" + orgName + '\'' +
                ", chairPerson=" + chairPerson +
                '}';
    }
}

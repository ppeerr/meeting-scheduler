package com.per.project.facade.dto;

public class ContractDto {

    private PersonDto leftSide;

    private PersonDto rightSide;

    private String title;

    public PersonDto getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(PersonDto leftSide) {
        this.leftSide = leftSide;
    }

    public PersonDto getRightSide() {
        return rightSide;
    }

    public void setRightSide(PersonDto rightSide) {
        this.rightSide = rightSide;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ContractDto{" +
                "leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                ", title='" + title + '\'' +
                '}';
    }
}

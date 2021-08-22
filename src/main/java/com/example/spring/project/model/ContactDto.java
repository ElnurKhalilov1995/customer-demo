package com.example.spring.project.model;

import com.example.spring.project.model.enums.ContactType;

public class ContactDto {
    private ContactType type;
    private String value;

    public ContactDto(ContactType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ContactDto() {
    }

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

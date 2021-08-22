/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring.project.model;

import java.util.List;

/**
 *
 * @author ehkhalilov
 */
public class CustomerDto {
    private String name;
    private String surname;
    private Integer age;
//    private String customerDetail;
//    private List<ContactDto> contacts;

    public CustomerDto() {
    }

    public CustomerDto(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //    public CustomerDto(String name, String surname, Integer age, String customerDetail, List<ContactDto> contacts) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.customerDetail = customerDetail;
//        this.contacts = contacts;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getCustomerDetail() {
//        return customerDetail;
//    }
//
//    public void setCustomerDetail(String customerDetail) {
//        this.customerDetail = customerDetail;
//    }
//
//    public List<ContactDto> getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(List<ContactDto> contacts) {
//        this.contacts = contacts;
//    }
}

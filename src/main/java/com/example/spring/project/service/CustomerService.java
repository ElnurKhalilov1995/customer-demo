/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring.project.service;

import com.example.spring.project.dao.entity.CustomerEntity;
import com.example.spring.project.model.CustomerDto;

import java.util.List;

/**
 *
 * @author ehkhalilov
 */
public interface CustomerService {
    List<CustomerDto> getAllCustomers();

    List<CustomerEntity> getAllCustomersWithOrder(String firstName, String lastName);

    CustomerDto getCustomerById(Integer id);

    CustomerEntity getCustomerByFirstName(String firstName);

    void saveCustomer(CustomerDto customerDto);

}

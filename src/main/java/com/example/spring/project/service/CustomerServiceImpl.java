/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring.project.service;

import com.example.spring.project.dao.entity.CustomerDetailsEntity;
import com.example.spring.project.dao.entity.CustomerEntity;
import com.example.spring.project.dao.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.spring.project.mapper.CustomerMapper;
import com.example.spring.project.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ehkhalilov
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll()
                .parallelStream()
                .map(CustomerMapper.INSTANCE::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<CustomerEntity> getAllCustomersWithOrder(String firstName, String lastName) {
//        return customerRepository.findAllByFirstNameOrderByIdDesc(firstName);
        var customers = customerRepository.
                mySelect(firstName, lastName)
                .stream()
                .filter((c) -> c.getFirstName().equals("Elnur"))
                .collect(Collectors.toList());
        return customers;
    }

    @Override
    public CustomerDto getCustomerById(Integer id) {
        Optional<CustomerEntity> optionalCustomerEntity =  customerRepository.findById(id);
        var customer = optionalCustomerEntity.orElseGet(CustomerEntity::new);
//        customer.getCustomerDetail().setCustomer(null);
        return CustomerMapper.INSTANCE.entityToDto(customer);
    }

    @Override
    public CustomerEntity getCustomerByFirstName(String firstName) {
        Optional<CustomerEntity> optionalCustomerEntity = customerRepository.findByFirstNameOrLastNameIgnoreCase(firstName, firstName);
        return optionalCustomerEntity.orElseGet(CustomerEntity::new);
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        var customer = CustomerMapper.INSTANCE.dtoToEntity(customerDto);
        customerRepository.save(customer);
    }
}

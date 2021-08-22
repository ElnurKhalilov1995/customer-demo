package com.example.spring.project.service;

import com.example.spring.project.dao.entity.CustomerDetailsEntity;
import com.example.spring.project.dao.repository.CustomerDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailService {
    private final CustomerDetailRepository repository;

    public CustomerDetailService(CustomerDetailRepository repository) {
        this.repository = repository;
    }

    public CustomerDetailsEntity getCustomerDetailById(Integer id) {
        return repository.getById(id);
    }
}

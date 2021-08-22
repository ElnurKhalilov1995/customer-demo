package com.example.spring.project.controller;

import com.example.spring.project.dao.entity.CustomerDetailsEntity;
import com.example.spring.project.service.CustomerDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/detail")
public class CustomerDetailController {

    private final CustomerDetailService service;

    public CustomerDetailController(CustomerDetailService service) {
        this.service = service;
    }

    @GetMapping("/{detailId}")
    public CustomerDetailsEntity getCustomerDetailsEntityById(@PathVariable Integer detailId) {
        return service.getCustomerDetailById(detailId);
    }
}

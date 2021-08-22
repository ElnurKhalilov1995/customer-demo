/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring.project.controller;

import com.example.spring.project.dao.entity.CustomerEntity;
import com.example.spring.project.model.CustomerDto;
import com.example.spring.project.model.NewClass;
import com.example.spring.project.service.CustomerService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ehkhalilov
 */
@RestController
@RequestMapping("/service/customer")
public class CustomerRestController {
    
    
    private final CustomerService customerService;
    
    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping({"/list/{firstName}/{lastName}"})
    public List<CustomerEntity> getCustomers(@PathVariable String firstName,
                                             @PathVariable String lastName) {
        return customerService.getAllCustomersWithOrder(firstName, lastName);
    }

    @GetMapping("/{customerId}")
    public CustomerDto getCustomerById(@PathVariable Integer customerId) {
        return customerService.getCustomerById(customerId);
    }

    @GetMapping("/name/{firstName}")
    public CustomerEntity getCustomerByFirstName(@PathVariable String firstName) {
        return customerService.getCustomerByFirstName(firstName);
    }

    @PostMapping("/save")
    public void saveCustomer(@RequestBody CustomerDto customer) {
        customerService.saveCustomer(customer);
    }

    @GetMapping("/test")
    public String getText() {
        return "Hello World!";
    }
    
    @PostMapping("/test")
    public void setText(@RequestBody NewClass newClass) {
        System.out.println(newClass.getTest());
    }
    
    @PutMapping("/test/{index}")
    public List<NewClass> examplePutMethod(@RequestBody NewClass newClass, @PathVariable("index") int id) {
        newClass.setId(id);
        NewClass newClass2 = newClass;
        List<NewClass> list = new ArrayList();
        list.add(newClass);
        list.add(newClass2);
        return list;
    }
//    http://localhost:7078/root/age/25/name/Elnur
//    http://localhost:7078/root/age/25/name/Elnur?surname=Khalilov
    @DeleteMapping("/age/{age}/name/{name}")
    public void exampleDeleteMethod(@PathVariable int age, 
            @PathVariable String name, @RequestParam String surname) {
        System.out.println(age);
        System.out.println(name);   
        System.out.println(surname);
    }
}

package com.example.spring.project.controller;

import com.example.spring.project.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/list"})
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getAllCustomers());
        return "customer-table";
    }
}

package com.example.spring.project.controller;

import com.example.spring.project.dao.entity.ContactEntity;
import com.example.spring.project.service.ContactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/{contactId}")
    public ContactEntity getContactById(@PathVariable Integer contactId) {
        return contactService.getContactById(contactId);
    }
}

package com.example.spring.project.service;

import com.example.spring.project.dao.entity.ContactEntity;
import com.example.spring.project.dao.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactEntity getContactById(Integer contactId) {
        System.out.println(contactRepository.findById(contactId).orElseGet(ContactEntity::new).getCustomer());
        return contactRepository.findById(contactId).orElseGet(ContactEntity::new);
    }
}

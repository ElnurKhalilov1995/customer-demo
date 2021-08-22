package com.example.spring.project.dao.repository;

import com.example.spring.project.dao.entity.ContactEntity;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {
}

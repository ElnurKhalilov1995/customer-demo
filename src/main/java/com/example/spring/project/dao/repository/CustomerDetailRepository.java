package com.example.spring.project.dao.repository;

import com.example.spring.project.dao.entity.CustomerDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailRepository extends JpaRepository<CustomerDetailsEntity, Integer> {
}

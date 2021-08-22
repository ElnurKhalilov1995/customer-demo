package com.example.spring.project.dao.repository;

import com.example.spring.project.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    Optional<CustomerEntity> findByFirstName(String firstName);
    Optional<CustomerEntity> findByFirstNameOrLastNameIgnoreCase(String firstName, String lastName);
    List<CustomerEntity> findAllByFirstNameOrderByIdDesc(String firstName);

    @Query(value = "select c from CustomerEntity c where c.firstName = :name or c.lastName = :lastName order by c.lastName")
    List<CustomerEntity> mySelect(String name, String lastName);
}

package com.example.spring.project.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String detail;

//    @OneToOne(mappedBy = "customerDetail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private CustomerEntity customer;

    public CustomerDetailsEntity() {
    }

    public CustomerDetailsEntity(Integer id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

//    public CustomerEntity getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(CustomerEntity customer) {
//        this.customer = customer;
//    }
}

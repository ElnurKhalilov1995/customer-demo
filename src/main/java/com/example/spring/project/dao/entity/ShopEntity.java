package com.example.spring.project.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "shop")
public class ShopEntity {
    @Id
    private Integer id;
    private String name;
//    @ManyToMany(mappedBy = "shops")
//    @JsonBackReference
//    private List<CustomerEntity> customers;

    public ShopEntity() {
    }

    public ShopEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<CustomerEntity> getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(List<CustomerEntity> customers) {
//        this.customers = customers;
//    }
}

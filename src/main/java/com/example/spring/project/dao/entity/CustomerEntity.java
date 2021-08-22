package com.example.spring.project.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean check;
//    @OneToOne
//    @JoinColumn(name = "customer_detail_id")
//    private CustomerDetailsEntity customerDetail;
//    @OneToMany(mappedBy = "customer")
//    @JsonManagedReference
//    private List<ContactEntity> contacts;
//    @ManyToMany
//    @JoinTable(
//            name = "shop_likes",
//            joinColumns = @JoinColumn(name = "customer_id"),
//            inverseJoinColumns = @JoinColumn(name = "shop_id"))
//    @JsonManagedReference
//    private List<ShopEntity> shops;

    public CustomerEntity() {
    }

    public CustomerEntity(Integer id, String firstName, String lastName, Boolean check) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.check = check;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}

package com.project.customerdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity {
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "address")
    private String address;
    @Column(name = "budget")
    private BigDecimal budget;


}

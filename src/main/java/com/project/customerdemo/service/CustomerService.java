package com.project.customerdemo.service;

import com.project.customerdemo.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}

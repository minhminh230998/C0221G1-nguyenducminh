package com.example.model.service;

import com.example.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAllCustomer(Pageable pageable);

    Customer findByIdCustomer(String id);

    Page<Customer> findByNameCustomer(String name, Pageable pageable);

    void saveCustomer(Customer customer);
    void deleteCustomer(String id);
}

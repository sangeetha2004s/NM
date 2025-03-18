package com.ecom.CustomerOrder.Repository;


import com.ecom.CustomerOrder.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }

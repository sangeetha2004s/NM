package com.ecom.CustomerOrder.Repository;

import com.ecom.CustomerOrder.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }

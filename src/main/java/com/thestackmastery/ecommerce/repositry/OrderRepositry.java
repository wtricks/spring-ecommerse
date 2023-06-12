package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Long> {
}

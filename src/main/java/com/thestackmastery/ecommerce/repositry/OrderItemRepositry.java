package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepositry extends JpaRepository<OrderItem, Long> {
}

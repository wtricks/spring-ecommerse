package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepositry extends JpaRepository<CartItem, Long> {
}

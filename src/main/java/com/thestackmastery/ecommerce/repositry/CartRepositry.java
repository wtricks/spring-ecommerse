package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepositry extends JpaRepository<Cart, Long> {
}

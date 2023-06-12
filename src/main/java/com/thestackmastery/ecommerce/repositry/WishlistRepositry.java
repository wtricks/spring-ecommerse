package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishlistRepositry extends JpaRepository<Wishlist, Long> {
}

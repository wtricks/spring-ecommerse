package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepositry extends JpaRepository<Review, Long> {
}

package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositry extends JpaRepository<Category, Long> {
}

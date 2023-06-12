package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<User, Long> {
}

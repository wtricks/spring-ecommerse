package com.thestackmastery.ecommerce.repositry;

import com.thestackmastery.ecommerce.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepositry extends JpaRepository<Address, Long> {
}

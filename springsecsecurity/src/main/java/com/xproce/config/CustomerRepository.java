package com.xproce.config;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Long,Customer> {
    List <Customer> findByEmail (String username);
}

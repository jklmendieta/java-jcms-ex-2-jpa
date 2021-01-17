package com.jcms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcms.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

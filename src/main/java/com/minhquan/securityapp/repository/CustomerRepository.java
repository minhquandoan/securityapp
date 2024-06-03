package com.minhquan.securityapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minhquan.securityapp.model.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    List<Customer> findByEmail(String email);
}

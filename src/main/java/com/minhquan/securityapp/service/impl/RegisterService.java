package com.minhquan.securityapp.service.impl;

import org.springframework.stereotype.Service;

import com.minhquan.securityapp.model.entity.Customer;
import com.minhquan.securityapp.repository.CustomerRepository;
import com.minhquan.securityapp.service.IRegisterService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RegisterService implements IRegisterService {

    private final CustomerRepository customerRepository;

    @Override
    public boolean signup(Customer customer) throws Exception {
        var customers = this.customerRepository.findByEmail(customer.getEmail());
        if (customers.size() > 0) {
            throw new Exception("Email already used!!");
        }

        var result = this.customerRepository.save(customer);
        return result != null;
    }
    
}

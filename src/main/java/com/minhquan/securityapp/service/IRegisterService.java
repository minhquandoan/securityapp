package com.minhquan.securityapp.service;

import com.minhquan.securityapp.model.entity.Customer;

public interface IRegisterService {
    public boolean signup(Customer customer) throws Exception;
}

package com.minhquan.securityapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhquan.securityapp.model.entity.Customer;
import com.minhquan.securityapp.service.IRegisterService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/register")
public class RegisterController {

    private final IRegisterService service;

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody Customer customer) {
        try {
            if (this.service.signup(customer)) {
                return ResponseEntity.status(201).body("Registered Successfully!");
            }
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.toString());
        }
        return null;
    }
}

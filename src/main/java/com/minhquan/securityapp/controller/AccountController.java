package com.minhquan.securityapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/myAccount")
    public ResponseEntity<String> getDetails() {
        return ResponseEntity.ok("Here details of account");
    }
}

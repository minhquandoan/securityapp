package com.minhquan.securityapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public ResponseEntity<String> saveContactInquiryDetails() {
        return ResponseEntity.ok("Saved contact to DB");
    }
}

package com.example.controller;

import com.example.entity.FraudCheck;
import com.example.service.FraudDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fraud")
public class FraudDetectionController {

    @Autowired
    private FraudDetectionService fraudDetectionService;

    @PostMapping("/check")
    public FraudCheck checkFraud(@RequestBody FraudCheck fraudCheck) {
        return fraudDetectionService.checkFraud(fraudCheck);
    }
}
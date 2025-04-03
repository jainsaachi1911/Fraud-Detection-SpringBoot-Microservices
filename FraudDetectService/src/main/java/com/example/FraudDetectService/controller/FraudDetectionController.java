package com.example.FraudDetectService.controller;

import com.example.FraudDetectService.entity.FraudCheck;
import com.example.FraudDetectService.service.FraudDetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud")
public class FraudDetectionController {

    @Autowired
    FraudDetectionService fraudDetectionService;

    @PostMapping("/check")
    public boolean isFraudulentTransaction(@RequestBody FraudCheck fraudCheck) {
        return fraudDetectionService.isFraudulentTransaction(fraudCheck);
    }
}

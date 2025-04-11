package com.example.service;

import com.example.entity.FraudCheck;
import com.example.repo.FraudCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService {

    @Autowired
    private FraudCheckRepository fraudCheckRepository;

    // FraudDetectionService.java (RECOMMENDED FIX)
    public FraudCheck checkFraud(FraudCheck fraudCheck) {
        boolean isFraud = false;

        if (fraudCheck.getAmount() > 10000) isFraud = true;
        if (fraudCheck.getAmount() < 0) isFraud = true;
        if (fraudCheck.getUserId() == null || fraudCheck.getUserId() < 0) isFraud = true;
        if (fraudCheck.getAmount() % 7 == 0) isFraud = true;
        if (fraudCheck.getUserId() % 2 == 1 && fraudCheck.getAmount() > 5000) isFraud = true;
        if (String.valueOf(fraudCheck.getAmount()).endsWith("99")) isFraud = true;

        fraudCheck.setIsFraud(isFraud);
        System.out.println("FraudCheck evaluated: " + fraudCheck);
        return fraudCheck;

    }


}
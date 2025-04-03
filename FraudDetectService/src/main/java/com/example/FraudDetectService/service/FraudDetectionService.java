package com.example.FraudDetectService.service;

import com.example.FraudDetectService.entity.FraudCheck;
import com.example.FraudDetectService.repository.FraudCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudDetectionService {

    @Autowired
    FraudCheckRepository fraudCheckRepository;

    public boolean isFraudulentTransaction(FraudCheck fraudCheck) {
        boolean isFraud = checkFraudRules(fraudCheck);
        fraudCheck.setFraudulent(isFraud);
        fraudCheckRepository.save(fraudCheck);
        return isFraud;
    }

    private boolean checkFraudRules(FraudCheck transaction) {
        if (transaction.getAmount() > 50000)
            return true;
        if (transaction.getTransactionsLast10Min() > 5)
            return true;
        if (transaction.isInternational() && transaction.getTransactionsLast10Min() == 0)
            return true;
        return false;
    }
}

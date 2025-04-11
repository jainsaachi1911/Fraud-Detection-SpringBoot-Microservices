package com.example.service;

import com.example.entity.Transaction;
import com.example.fraud.FraudCheck;
import com.example.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction createTransaction(Transaction transaction) {
        transaction.setTimestamp(LocalDateTime.now());

        FraudCheck request = new FraudCheck();
        request.setUserId(transaction.getUserId());
        request.setAmount(transaction.getAmount());

        FraudCheck response = restTemplate.postForObject(
                "http://FRAUD-DETECT-SERVICE/fraud/check", request, FraudCheck.class
        );

        System.out.println("FraudCheck Response: " + response);
        if (response == null || response.getIsFraud() == null) {
            throw new RuntimeException("Invalid response from Fraud Detection Service");
        }


        transaction.setIsFraud(response != null && Boolean.TRUE.equals(response.getIsFraud()));
        System.out.println("FraudCheck response from service: " + response);

        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}
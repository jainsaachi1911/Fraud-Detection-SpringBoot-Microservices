package com.example.service;

import com.example.entity.Transaction;
import com.example.repo.TransactionRepo;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Service
public class TransactionService {
    private final TransactionRepo transactionrepo;

    public TransactionService(TransactionRepo transactionrepo) {
        this.transactionrepo = transactionrepo;
    }

    public Transaction createTransaction(Transaction transaction){
        transaction.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        return transactionrepo.save(transaction);
    }

    public Transaction getTransaction(int id){
        return transactionrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));
    }
}

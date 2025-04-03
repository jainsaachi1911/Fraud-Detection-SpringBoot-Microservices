package com.example.FraudDetectService.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "fraud_checks")
public class FraudCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private double amount;
    private boolean isInternational;
    private int transactionsLast10Min;
    private LocalDateTime timestamp;
    private boolean isFraudulent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public int getTransactionsLast10Min() {
        return transactionsLast10Min;
    }

    public void setTransactionsLast10Min(int transactionsLast10Min) {
        this.transactionsLast10Min = transactionsLast10Min;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    public void setFraudulent(boolean fraudulent) {
        isFraudulent = fraudulent;
    }
}


package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int accountId;
    private BigDecimal amount;
    private Timestamp timestamp;
    private String status;
    private String location;
    private int merchantId;

    public Transaction(){}

    public Transaction(int id,int accountId,BigDecimal amount, Timestamp timestamp, String string,String location, int merchantId){
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.status = status;
        this.location = location;
        this.merchantId = merchantId;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getAccountId() { return accountId; }

    public void setAccountId(int accountId) { this.accountId = accountId; }

    public BigDecimal getAmount() { return amount; }

    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public Timestamp getTimestamp() { return timestamp; }

    public void setTimestamp(Timestamp timestamp) { this.timestamp = timestamp; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public int getMerchantId() { return merchantId; }

    public void setMerchantId(int merchantId) { this.merchantId = merchantId; }
}


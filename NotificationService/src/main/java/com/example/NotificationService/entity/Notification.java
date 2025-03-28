package com.example.NotificationService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int alertId;

    public Notification(int id, int userId, int alertId, String message, LocalDateTime sentAt, String status) {
        this.id = id;
        this.userId = userId;
        this.alertId = alertId;
        this.message = message;
        this.sentAt = sentAt;
        this.status = status;
    }

    private String message;
    private LocalDateTime sentAt;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getAlertId() {
        return alertId;
    }

    public void setAlertId(int alertId) {
        this.alertId = alertId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }






}

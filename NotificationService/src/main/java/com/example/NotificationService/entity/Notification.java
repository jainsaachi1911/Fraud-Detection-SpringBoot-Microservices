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

    public Notification() {}

    public Notification(int userId, int alertId, String message, LocalDateTime sentAt, String status) {
        this.userId = userId;
        this.alertId = alertId;
        this.message = message;
        this.sentAt = sentAt;
        this.status = status;
    }

    private String message;
    private LocalDateTime sentAt;
    private String status;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getAlertId() { return alertId; }
    public void setAlertId(int alertId) { this.alertId = alertId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getSentAt() { return sentAt; }
    public void setSentAt(LocalDateTime sentAt) { this.sentAt = sentAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }








}

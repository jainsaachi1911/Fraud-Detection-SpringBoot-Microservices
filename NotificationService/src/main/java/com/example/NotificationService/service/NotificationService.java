package com.example.NotificationService.service;

import com.example.NotificationService.entity.Notification;
import com.example.NotificationService.repo.NotificationRepo;
import org.springframework.stereotype.Service;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepo notificationRepo;

    public NotificationService(NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    public Notification createNotification(Notification notification){
        notification.setSentAt(LocalDateTime.now());
        return notificationRepo.save(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationRepo.findAll();
    }
}

package com.example.FraudDetectService.repository;

import com.example.FraudDetectService.entity.FraudCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheck, Long> {
}

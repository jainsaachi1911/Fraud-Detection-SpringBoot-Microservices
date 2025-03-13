# Fraud Detection in Digital Transactions

## Introduction
As digital transactions increase, so do fraud risks. This project aims to develop a **real-time fraud detection system** using **AI-based analytics, microservices, and event-driven architecture** to prevent fraudulent transactions dynamically.

## Features
- Real-time transaction processing and fraud detection.
- Microservices architecture for scalability and modularity.
- AI-based anomaly detection for pattern analysis.
- Event-driven processing using **Kafka**.
- High performance and security with **Spring Boot, Redis, and JWT authentication**.
- Instant fraud alerts via **SMS or email**.

## Technologies Used
- **Backend:** Spring Boot (Java)
- **Machine Learning:** Python (Scikit-learn, TensorFlow, PyTorch)
- **Messaging Queue:** Apache Kafka
- **Database:** MySQL
- **API Gateway:** Spring Cloud Gateway
- **Service Discovery:** Eureka Server

## Expected Outcome
- A fully functional real-time fraud detection system.
- Scalable microservices-based architecture.
- Adaptive machine learning models that improve over time.
- Secure and high-performance system capable of handling large transaction volumes.

## Setup Instructions
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Configure **MySQL, Kafka, and Redis**.
3. Set up **Spring Boot services** and **ML models**.
4. Run the services in order:
   - **Eureka Server**
   - **API Gateway**
   - **Microservices** (User, Transaction, Fraud Detection, Notification)
5. Monitor logs and alerts for fraudulent activities.

## Contributors
- Saachi Jain
- Pragya Ghosh
- Prakhar Gupta
- Shriya Sankhe
- **Faculty Mentor:** Rajiv Gupta

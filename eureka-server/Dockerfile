# Use an official OpenJDK runtime as a parent image matching your Java version
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Argument to find the JAR file (Maven typically puts it in target/)
ARG JAR_FILE=target/*.jar

# Copy the executable JAR file created by Maven into the container
COPY ${JAR_FILE} app.jar

# Expose the port the application runs on (defined in application.properties)
# This is mostly for documentation; docker-compose handles the actual mapping
# EXPOSE <your_service_port> # e.g., EXPOSE 8081 for UserService

# Define the command to run the application when the container starts
ENTRYPOINT ["java","-jar","/app/app.jar"]
FROM eclipse-temurin:21-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
COPY src/main/resources/application.properties /app/config/
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.config.additional-location=file:/app/config/"]


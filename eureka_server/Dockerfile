# Use OpenJDK 21
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file
COPY target/eureka_server-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose port 8761 (Eureka Server)
EXPOSE 8761

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

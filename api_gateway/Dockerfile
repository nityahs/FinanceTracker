# Use OpenJDK 21 as base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file into container
COPY target/api-gateway-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose port 9091 (API Gateway)
EXPOSE 9091

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

# Use OpenJDK 21
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file
COPY target/config-client-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose port 8083 (Budget Service)
EXPOSE 8083

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

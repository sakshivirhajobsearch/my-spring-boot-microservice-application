# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged JAR file
COPY target/service-registry-*.jar service-registry.jar

# Expose the port
EXPOSE 8761

# Command to run the application
ENTRYPOINT ["java", "-jar", "service-registry.jar"]

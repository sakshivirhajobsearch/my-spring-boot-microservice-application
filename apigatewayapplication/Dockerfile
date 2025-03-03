# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged JAR file
COPY target/api-gateway-*.jar api-gateway.jar

# Expose the port
EXPOSE 8082

# Command to run the application
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]

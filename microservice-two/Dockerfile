# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged JAR file
COPY target/microservice-two-*.jar microservice-two.jar

# Expose the port
EXPOSE 8084

# Command to run the application
ENTRYPOINT ["java", "-jar", "microservice-two.jar"]

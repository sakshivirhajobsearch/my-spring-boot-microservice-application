# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the packaged JAR file
COPY target/microservice-one-*.jar microservice-one.jar

# Expose the port
EXPOSE 8083

# Command to run the application
ENTRYPOINT ["java", "-jar", "microservice-one.jar"]

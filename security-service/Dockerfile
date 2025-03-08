FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/security-service-*.jar security-service.jar
EXPOSE 9003
ENTRYPOINT ["java", "-jar", "security-service.jar"]
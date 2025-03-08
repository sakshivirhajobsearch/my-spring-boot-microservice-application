FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/logging-service-*.jar logging-service.jar
EXPOSE 9004
ENTRYPOINT ["java", "-jar", "logging-service.jar"]
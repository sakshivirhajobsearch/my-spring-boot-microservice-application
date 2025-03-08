FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/microservice-two-service-*.jar microservice-two-service.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "microservice-two-service.jar"]
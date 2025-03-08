FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/microservice-one-service-*.jar microservice-one-service.jar
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "microservice-one-service.jar"]
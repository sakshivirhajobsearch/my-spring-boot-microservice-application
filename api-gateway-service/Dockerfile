FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/api-gateway-service-*.jar api-gateway-service.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "api-gateway-service.jar"]
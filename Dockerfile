FROM openjdk:17-jdk-slim
COPY target/my-spring-boot-app.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

FROM openjdk:20-ea-4-jdk
WORKDIR /app
COPY target/spring-boot-with-syslog-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]

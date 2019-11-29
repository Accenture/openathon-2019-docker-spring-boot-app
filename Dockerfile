### Build application
FROM maven:3-jdk-8 AS builder
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

### Build image docker
FROM openjdk:8-jdk-alpine
WORKDIR /app/
COPY --from=builder /build/target/*.jar demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]

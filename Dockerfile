# Base image
FROM openjdk:21
WORKDIR /app

# Gradle 빌드 후 생성된 JAR 파일 복사
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# Spring Boot 실행
ENTRYPOINT ["java","-jar","/app/app.jar"]
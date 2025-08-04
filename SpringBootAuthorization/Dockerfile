FROM debian:stable-slim

EXPOSE 8080

RUN apt update -y && \
    apt install -y openjdk-17-jre && \
    mkdir -p /app

COPY target/SpringBoot-0.0.1-SNAPSHOT.jar /app/server.jar


ENTRYPOINT ["java", "-jar", "/app/server.jar"]
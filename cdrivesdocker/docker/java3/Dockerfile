FROM alpine:latest

ADD docker3-0.0.1-SNAPSHOT.jar app.jar
RUN apk --update add openjdk8-jre

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]






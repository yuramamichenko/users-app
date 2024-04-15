FROM ubuntu:latest
LABEL authors="yura"
COPY target/UsersApp-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","App"]
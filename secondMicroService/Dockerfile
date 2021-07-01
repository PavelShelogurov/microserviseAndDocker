FROM openjdk:8

RUN mkdir -p /www/backend/secondMicroService

WORKDIR /www/backend/secondMicroService

COPY ./target/secondMicroService-0.0.1-SNAPSHOT.jar /www/backend/secondMicroService

EXPOSE 8090

CMD ["java", "-jar", "secondMicroService-0.0.1-SNAPSHOT.jar"]
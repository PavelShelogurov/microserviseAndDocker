FROM openjdk:8

ENV TEMPERATURE-SERVICE-URL=http://localhost:8090/api/temp

RUN mkdir -p /www/backend/front-service

WORKDIR /www/backend/front-service

COPY ./target/firstMicroService-0.0.1-SNAPSHOT.jar /www/backend/front-service

EXPOSE 8080

CMD ["java", "-jar", "firstMicroService-0.0.1-SNAPSHOT.jar"]



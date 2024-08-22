FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/test-classes/ /app/

RUN mvn test

EXPOSE 9999

CMD ["mvn", "test"]
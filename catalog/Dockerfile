FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/catalogservice.jar
COPY ${JAR_FILE} catalog-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "catalog-service.jar"]
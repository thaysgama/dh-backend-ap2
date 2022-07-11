FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/movieservice.jar
COPY ${JAR_FILE} serie-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "serie-service.jar"]
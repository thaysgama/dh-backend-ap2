FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/movieservice.jar
COPY ${JAR_FILE} movie-service.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "movie-service.jar"]
FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/configserver.jar
COPY ${JAR_FILE} config-server.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "config-server.jar"]
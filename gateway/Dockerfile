FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/apigateway.jar
COPY ${JAR_FILE} api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
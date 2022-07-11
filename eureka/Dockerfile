FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=/target/eurekaservice.jar
COPY ${JAR_FILE} eureka-service.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka-service.jar"]
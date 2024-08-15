FROM openjdk:17
EXPOSE 8080
ADD target/rest-backend.jar rest-backend.jar
ENTRYPOINT ["java","-jar","/rest-backend.jar"]